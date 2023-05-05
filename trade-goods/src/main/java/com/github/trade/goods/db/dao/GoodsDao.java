package com.github.trade.goods.db.dao;


import com.github.trade.goods.db.model.Goods;


/**
 * DAO Data access object
 */
/**
 * 商品数据库操作接口
 */
public interface GoodsDao {
    /**
     * 插入一个商品 insert/create a goods
     * @param goods
     * @return
     */
    boolean insertGoods(Goods goods);

    /**
     * 根据ID删除对应的商品 delete
     * @param id
     * @return
     */
    boolean deleteGoods(long id);

    /**
     * 根据ID查询对应的商品
     * @param id
     * @return
     */
    Goods queryGoodsById(long id);

    /**
     * 修改对应的商品信息 update
     * @param goods
     * @return
     */
    boolean updateGoods(Goods goods);
}