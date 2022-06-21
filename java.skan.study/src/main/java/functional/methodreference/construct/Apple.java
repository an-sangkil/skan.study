package functional.methodreference.construct;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 *
 * @author skan
 * @version Copyright (C) 2022 by CJENM|MezzoMedia. All right reserved.
 * @since 2022/06/13
 */
@ToString
@Getter@Setter
public class Apple {
     String name;
     String color;
     int weight;

     public Apple() {
     }

     public Apple(int weight) {
          this.weight = weight;
     }

     public Apple(String color, int weight) {
          this.color = color;
          this.weight = weight;
     }

}