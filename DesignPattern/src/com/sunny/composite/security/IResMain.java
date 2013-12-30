/**
 * File name： IResMain.java
 * Author：        wangpj
 * Create Date： 2013-12-24
 * Description:
 * 
 */

package com.sunny.composite.security;

/**
 * @author wangpj
 * 
 */
public class IResMain {

	/**
	 * user: wangpj tags: @param args date: 2013-12-24 void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** 买支雪糕 */
		IRes singleIRes = new SingleResImpl("雪糕", 1.5f);
		/** 买单 */
		singleIRes.pay();

		/** 快过年了，我推了个购物车，多买点东西 */
		IRes mutiIRes = new MultiResImpl();

		/** 在一楼买的食物 */
		IRes one = new MultiResImpl();
		/** 把一楼买的东西放入购物车 */
		((MultiResImpl) mutiIRes).addRes(one);

		/** 因为是安全方式的组合模式，因此不够透明，只能明确的向下转型，然后再加入购物车了 */
		((MultiResImpl) one).addRes(new SingleResImpl("旺旺", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("小强", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("达芙妮", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("徐福记", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("美的", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("诺基亚", 28.5f));

		/** 在二楼买的食物 */
		IRes two = new MultiResImpl();
		/** 把一楼买的东西放入购物车 */
		((MultiResImpl) mutiIRes).addRes(two);
		((MultiResImpl) two).addRes(new SingleResImpl("衣服", 130.5f));
		((MultiResImpl) two).addRes(new SingleResImpl("袜子", 10f));

		IRes bao = new MultiResImpl();
		((MultiResImpl) two).addRes(bao);// 把购物小包装在二楼购物车里
		((MultiResImpl) bao).addRes(new SingleResImpl("手表", 100f));

		/** 回到一楼，又买了苹果和梨 */
		((MultiResImpl) one).addRes(new SingleResImpl("苹果", 10.0f));
		((MultiResImpl) one).addRes(new SingleResImpl("梨", 3.0f));
		/** 在买单之前我把可乐退了，因为家里还有的嘛 */
		((MultiResImpl) one).removeRes(new SingleResImpl("小强", 28.5f));
		/** 在收银台一次性对购物车所有物品买单 */
		mutiIRes.pay();
	}

}
