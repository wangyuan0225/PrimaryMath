package work;

public interface UserDao {
	/**
	 * 加法
	 * @return 加法答案
	 */
	int plus();

	/**
	 * 减法
	 * @return 减法答案
	 */
	int minus();

	/**
	 * 乘法
	 * @return 乘法答案
	 */
	int multiply();

	/**
	 * 除法
	 * @return 除法答案
	 */
	int divide();

	/**
	 * 生成随机计算
	 * @return 成绩
	 */
	int calculator();

}
