package eleme.model.restaurant;

/**
 * Created by azure on 2017/11/28.
 */
public class Recommend{
    private boolean isAd;
    private String reason;

    public boolean getIsAd(){
        return isAd;
    }
    public void setIsAd(boolean input){
        this.isAd = input;
    }
    public String getReason(){
        return reason;
    }
    public void setReason(String input){
        this.reason = input;
    }
}
