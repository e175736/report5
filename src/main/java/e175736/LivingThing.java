package e175736;

public class LivingThing {
    /**
     * 敵クラス。
     *  String name; //敵の名前
     *  int hitPoint; //敵のHP
     *  int attack; //敵の攻撃力
     *  boolean dead; //敵の生死状態。
     */
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing (String name, int maximumHP, int attack) {
        /**
         * コンストラクタ。名前、最大HP、攻撃力を指定する。
         *
         * @param name      モンスター名
         * @param maximumHP モンスターのHP
         * @param attack    モンスターの攻撃力
         */
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }



    public String getName2(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public int getHitPoint(){
        return hitPoint;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }


    public int getAttack(){
        return attack;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }


    public boolean getDead2(){
        return dead;
    }
    public void setDead2(boolean dead){
        this.dead = dead;
    }


    public boolean isDead() {
        return dead;
    }


    public String getName(){
        return name;
    }



    public void attack(LivingThing opponent){
        if(dead == false){//deadがfalseすなわち生きている場合にのみ処理を実行させると解消できる
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }



}