package com.github.trade.goods.db.dao;

import com.github.trade.goods.db.mappers.GoodsMapper;
import com.github.trade.goods.db.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsDaoImpl implements GoodsDao {

    @Autowired
    public GoodsMapper goodsMapper;

    @Override
    public boolean insertGoods(Goods goods) {
        return goodsMapper.insert(goods) > 0;
    }

    @Override
    public boolean deleteGoods(long id) {
        return goodsMapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public Goods queryGoodsById(long id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateGoods(Goods goods) {
        return goodsMapper.updateByPrimaryKey(goods) > 0;
    }
}
