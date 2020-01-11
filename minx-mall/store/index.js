import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const  store = new Vuex.Store({

	state:{
		// 是否登录
		hasLogin:false,
		// 用户信息
		userInfo:{}
	},
	
	mutations:{
		
		login(state,data){
			 
			  state.hasLogin = true ;
			  state.userInfo = data ;
			  // 缓存用户身份
			  uni.setStorage({
				 key:'userInfo',
				 data
			  });
			
		},
		logout(state) {
			 
			 state.hasLogin = false ;
			 state.userInfo = {} ;
			 uni.removeStorage({
			 	 key:'userInfo'
			 })
		}
	},
	actions:{}
}) ;

export default store


