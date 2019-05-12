package jim.pers.jerp.mapper;

import jim.pers.jerp.model.PurchOrder;

import java.util.List;

public interface PurchOrderMapper {
    public PurchOrder getPurchOrderByUuid(int uuid);
    public List<PurchOrder> getAllPurchOrders();
}
