package generic;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Description :
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/14
 */
public class GenericTest02 {

    GenericService<? super AbstractMutateForm> genericService;

    public <T extends AbstractMutateForm> void create(T data) {
        System.out.println(data);
    }

    public void create2(String name) {
        genericService = new GenericService01Impl();

        AbstractMutateForm mutateForm = new RequestMutateForm("request " + name);
        genericService.create(mutateForm);

        GoogleMutateForm mutateForm2 = new GoogleMutateForm("google " + name);
        genericService = new GenericService02Impl();
        genericService.create(mutateForm2);
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
    public void create(AbstractMutateForm requestMutateForm) {
        System.out.println(requestMutateForm);
    }
}

class GenericService02Impl implements GenericService<GoogleMutateForm>{
    @Override
    public void create(GoogleMutateForm googleMutateForm) {
        System.out.println(googleMutateForm);
    }
}

interface GenericService<D extends AbstractMutateForm> {
    void create(D d);
}