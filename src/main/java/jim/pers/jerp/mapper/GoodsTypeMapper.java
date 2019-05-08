package jim.pers.jerp.mapper;

import jim.pers.jerp.model.GoodsType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsTypeMapper {
    public GoodsType getGoodsTypeByUuid(int uuid);
    public List<GoodsType> getGoodsTypeAll();
    public int addGoodsType(GoodsType goodsType);
    public int updateGoodsType(GoodsType goodsType);
    public int deleteGoodsType(int uuid);
}
