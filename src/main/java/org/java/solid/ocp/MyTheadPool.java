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
		int max = Integer.parseInt(config.get("max_pool_thread"));
		int min = Integer.parseInt(config.get(("min_pool_thread")));
		int init = Integer.parseInt(config.get("init_pool_thread"));
		String poolName = config.get("thread_pool_name");

		//省略具体实现
		return Executors.newCachedThreadPool();
	}
}
