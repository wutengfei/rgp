package observer;
/**
* @author 周亮 
* @version 创建时间：2016年10月10日 下午4:46:46
* 类说明:被监听的攻击者
*/
public interface MonsterAttackObservable {
	//增加一个观察者
	public void addAttackObserver(MonsterAttackObserver observer);
	//删除一个观察者
	public void delAttackObserver(MonsterAttackObserver observer);
	/**
	 * 发生攻击动作，通知观察者，包括攻击的值，当前位置
	 * @param dir_x 攻击者移动的x方向
	 * @param dir_y 攻击者移动的y方向
	 * @param posx 攻击者的x坐标
	 * @param posy 攻击者的y坐标
	 * @param delta Time passed since last frame (milliseconds).
	 * @param attackValue 攻击产生的伤害值
	 */
	public void notifyAttackObservers(int dir_x,int dir_y,double posx, double posy,double delta,int attackValue);
}
