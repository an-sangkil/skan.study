package generic;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description :
 *
 * @author skan
 * @version Copyright (C) 2022 by .All right reserved.
 * @since 2022/03/14
 */
public class GenericTest02 {



    public <T extends AbstractMutateForm> void create(T data) {
        System.out.println(data);
    }

    public void create2(String name) {
        GenericService<? super AbstractMutateForm>   genericService01 = new GenericService01Impl();
        GenericService<? super RequestMutateForm>  genericService02 = new GenericService02Impl();
        GenericService<GoogleMutateForm>             genericService03 = new GenericService03Impl();

        RequestMutateForm mutateForm2 = new RequestMutateForm("request " + name);
        genericService01.create(mutateForm2);
        genericService02.create(mutateForm2);

        GoogleMutateForm mutateForm3 = new GoogleMutateForm("google " + name);
        genericService03.create(mutateForm3);
    }
}


@Data
abstract class AbstractMutateForm {
    String id;
}
@EqualsAndHashCode(callSuper = true)
@Data
class RequestMutateForm extends AbstractMutateForm {
    String name;

    public RequestMutateForm(String name) {
        this.name = name;
    }
}

@EqualsAndHashCode(callSuper = true)
@Data
class GoogleMutateForm extends AbstractMutateForm {
    String name;
    public GoogleMutateForm(String name) {
        this.name = name;
    }
}


class GenericService01Impl implements GenericService<AbstractMutateForm>{
    @Override
    public void create(AbstractMutateForm abstractMutateForm) {
        System.out.println(abstractMutateForm);
    }
}


class GenericService02Impl implements GenericService<RequestMutateForm>{
    @Override
    public void create(RequestMutateForm requestMutateForm) {
        System.out.println(requestMutateForm);
    }
}

class GenericService03Impl implements GenericService<GoogleMutateForm>{
    @Override
    public void create(GoogleMutateForm googleMutateForm) {
        System.out.println(googleMutateForm);
    }
}

interface GenericService<D extends AbstractMutateForm> {
    void create(D d);
}