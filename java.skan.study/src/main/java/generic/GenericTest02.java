package generic;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/03/14
 */
public class GenericTest02 {

    GenericService02<MutateForm> genericService02;

    public <T extends MutateForm> void create(T data) {
        System.out.println(data);
    }

    public void create2(String name) {
        MutateForm mutateForm = new RequestMutateForm("request " + name);
        genericService02 = new GenericService02Impl();
        genericService02.create(mutateForm);

        mutateForm = new GoogleMutateForm("google " + name);
        genericService02.create(mutateForm);
    }
}


@Data
abstract class MutateForm {
    String id;
}
@EqualsAndHashCode(callSuper = true)
@Data
class RequestMutateForm extends MutateForm {
    String name;

    public RequestMutateForm(String name) {
        this.name = name;
    }
}

@EqualsAndHashCode(callSuper = true)
@Data
class GoogleMutateForm extends MutateForm {
    String name;

    public GoogleMutateForm(String name) {
        this.name = name;
    }
}


class GenericService02Impl implements GenericService02<MutateForm>{
    @Override
    public void create(MutateForm requestMutateForm) {
        System.out.println(requestMutateForm);
    }
}

interface GenericService02<D extends MutateForm> {
    void create(D d);
}