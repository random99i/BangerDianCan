package banger.action.util;
/*
create by yang on 2017.8.7
a model for  select product and product number
 */
public class ProductNum {
    private long productId;
    private int carProductNum;
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }



    public int getCarProductNum() {
        return carProductNum;
    }

    public void setCarProductNum(int carProductNum) {
        this.carProductNum = carProductNum;
    }

}
