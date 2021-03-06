package jim.pers.jerp.mapper;

import jim.pers.jerp.model.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SupplierMapper {
    public Supplier getSupplierByUuid(int uuid);
    public List<Supplier> getAllSuppliers();
    public int updateSuppliers(Supplier supplier);
    public int addSupplier(Supplier supplier);
    public int deleteSupplier(int uuid);
}
