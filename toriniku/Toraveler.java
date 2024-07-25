import java.util.Random;

public abstract class Toraveler extends Object{//小川さんの指摘のおかげで問題が解決できました。
    public void perfom(){
        String aName = this.getName();//共通しているところを継承する
        System.out.println( aName +"は鳥に対し攻撃を行った");
        System.out.println(aName +"は走って鶏肉を取りに行った");
        this.cook();
    }  
    public void cook(){
        Paimon paimon = new Paimon();//パイモンというメソッドを取得して
        String pName = paimon.getName();//パイモンに入っているgetNameを取り出す
        Random random = new Random();//ランダム関数を使ってランダムにする
        int randomNumber = random.nextInt(100);//100までの数字を取り出す
        if(randomNumber >= 30){//randomNumberが30以上の場合にtrueになる
            System.out.println("鶏肉のスウィートフラワー漬け焼きは完ぺきにできた");
            System.out.println("美味しそうな鶏肉のスウィートフラワー漬け焼きが完成した");
            System.out.println(pName + "は美味しそうな鶏肉のスウィートフラワー漬け焼きを満足そうに食べた");
        }else{
            System.out.println("鶏肉のスウィートフラワー漬け焼きは失敗した");
            System.out.println("微妙な鶏肉のスウィートフラワー漬け焼きが完成した");
            System.out.println(pName + "は微妙な鶏肉のスウィートフラワー漬け焼きを苦笑いをしながら食べた");
        }
    }
   public abstract String getName();
    
}
 
