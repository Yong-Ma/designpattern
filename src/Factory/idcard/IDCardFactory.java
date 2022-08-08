package Factory.idcard;
import Factory.framework.Product;
import Factory.framework.Factory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList();
    private Integer serial = 0;
    private Map<Integer, String> owernerMap2Num = new ConcurrentHashMap<>();
    @Override
    protected synchronized Product createProduct(String owner) {
        IDCard idCard = new IDCard(owner, serial++);
        return idCard;
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        owners.add(idCard.getOwner());
        owernerMap2Num.put(idCard.getNumber(), idCard.getOwner());
    }
    public List<String> getOwners() {
        return owners;
    }

    public Map<Integer, String> getOwernerMap2Num() {
        return owernerMap2Num;
    }
}
