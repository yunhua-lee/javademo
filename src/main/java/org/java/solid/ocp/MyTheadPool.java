package org.java.solid.ocp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Desctiption
 * @Author wallace
 * @Date 2022/7/21
 */
public class MyTheadPool {
	private IConfig config;

	public MyTheadPool(IConfig config){
		this.config = config;
	}

	public ExecutorService createPool(){
		int max = Integer.parseInt(config.getValue("max_pool_thread"));
		int min = Integer.parseInt(config.getValue(("min_pool_thread")));
		int init = Integer.parseInt(config.getValue("init_pool_thread"));
		String poolName = config.getValue("thread_pool_name");

		//省略具体实现
		return Executors.newCachedThreadPool();
	}
}
