package designpattern.factory.methodfactory;

import lombok.*;

/**
 * <pre>
 * Description :
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/12/05
 */
@RequiredArgsConstructor
@ToString
@Getter@Setter
public class Character {
    final String name;
    final String color;
    String gender;
    String header;
    String body;
    String footer;
}
