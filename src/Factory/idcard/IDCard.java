package Factory.idcard;
import Factory.framework.Product;

public class IDCard extends Product {
    private Integer number;

    IDCard(String owner, Integer number) {
        System.out.println("制作" + owner + "的ID卡。卡号为" + number);
        this.owner = owner;
        this.number = number;
    }
    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    public Integer getNumber() {
        return number;
    }
}
