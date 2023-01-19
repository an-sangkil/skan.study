package designpattern.structure.flyweight;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author skan
 * @since 2023/01/12
 */
@ToString(callSuper = true)
@Getter@Setter
public class Goliath extends Unit {

    public Goliath(String color) {
        super(color);
    }

    // 테란 차량 장갑 (upgrade level)
    private String terranVehiclePlating;

    // 2연장 자동포 (upgrade level)
    private String twinAutocannons;

    // 지옥불 미사일 (upgrade level)
    private String hellfireMissilePack;

    // 카론 증폭기 (upgrade level)
    private String charonBoosters;

}
