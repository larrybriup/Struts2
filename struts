struts2
1,struts2框架引入到web项目中
	1)把struts2相关jar包倒入到项目
	2)把struts的配置文件放到src下面,名字叫做struts.xml(运行时配置文件会被框架自动读取)
	3)在web.xml中配置struts2框架的过滤器.
		这个过滤器的作用就是拦截struts2框架中的action.
		如果不配置filter,struts框架就不会工作.
		第一种配置方式,2.0版本使用的方式
		<filter>
		  	<filter-name>struts2</filter-name>
		  	<filter-class>org.apache.struts2.dispatcher.FilterDispatcher</filter-class>
	 	 </filter>
  第二种配置方式,2.0以上的版本使用的方式
	  <filter>
	  	<filter-name>struts2</filter-name>
	  	<filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
	  </filter>  
	2,struts2中的Action
		struts2框架底层还是用servlet实现的,封装了servlet的相关内容.只不过他除了servlet的功能外还扩展了
		一些其他功能
		在struts2框架中有一种类就是用来代替以前在web项目中所使用的servlet,这种类在struts2中被称为Action
		所以Action也是一种java类,比servlet功能更加强大的java类,同时比servlet更加简单
	3,为什么Action会有如此强大的功能以及简洁的操作?
		因为我们在web.xml中配置了struts2框架中专门的过滤器,用作拦截访问action的请求,拦截住之后,就可以
		给Action添加更多丰富的功能.
	4,如何去写一个struts2框架中的Action.
		1)只需要类中有一个固定的方法:
			public String execute(){
			
			return "...";
			}
			注意:execute方法一定要返回String类型的对象,将来就是根据字符串对象确定跳转的页面的,每一个字符
			串都可以对应一个页面,字符串是可以自己随便定义的,可以跳转到哪一个页面也是可以自定义的,在
			struts.xml中配置.
			不需要实现或者继承任何接口或者父类
		2)实现Action接口com.opensymphony.xwork2包下的.只有一个抽象方法execute(),同时有五个静态属性:
		ERROR,SUCCESS,INPUT,NONE,LOGIN
		
		3)继承一个父类ActionSupport,com.opensymphony.xwork2 包下的,重写execute方法
			这一中是以后要经常用的.
			
	5,写完Action之后需要在struts.xml文件中去配置,
		在struts.xml配置action的作用是通知struts2框架我们写的这个类是一个Action,将来struts2框架中要给这
		个类创建对象,调用方法以加入更多的功能.
		例如:
		<package name="test" extends="struts-default" namespace="/test">
			<action name="MyTest">
				<result>/index.jsp</result>
			</action>
			<action name="test1" class="com.eagle.web.action.ActionTest1">
				<result name="myFirstAction">/success.jsp</result>
				<result name="myError">/error.jsp</result>
    		</action>
    	</package>
    	name="test1"表示当前配置这个action的名字为test1,可以和action的名字相同,将来浏览器就是要根据这个
    	名字去访问当前这个action.
    	calss="com.eagle.web.action.ActionTest1"表示当前的action对应哪个类,也可以不对应任何类
    	result表示action要访问完之后有哪些跳转.
    	<result name="myError">/error.jsp</result>表示如果当前这个action返回的是error那么页面就跳转到/
    	error.jsp
    	注意:每个action访问完后都会有一个字符串类型的返回值.即使访问一个没有任何java类对应的action,这个
    	action也会默认返回字符串:success
    	<result>/index.jsp</result>标签中的name默认值就是success.
    	
    	<package name="test" extends="struts-default" namespace="/test">
    	一个struts.xml文件中哦可以配置多个package标签,一个package标签可以配置多个action,一个action标
    	签
    	中可以配置多个result标签.
    	name="test"表示当前这个package叫test,作用:1,唯一标识当前这个package.2,方便package之间的继承.
    	extends="struts-default"表示当前这个package继承了另外一个名字叫做struts-default的package,这个
    	package在struts2的核心jar包中的struts-default.xml文件中定义的,里面有很多默认配置.
    	注意:struts2中的所有package都会直接或者间接的继承struts-default这个package
    	namespace="/test"表示当前package的命名空间为/test,将来这个package里面的所有action被访问的时
    	候,路径里都需要加上这个命名空间.
   6,在struts.xml文件中配置struts2框架的属性.
   	<constant name="struts.devMode" value="true"></constant>
   	配置struts.devMode的值为true时可以对开发者更加的友好,会自动reload项目.
    	<!-- 设置ognl表达式可以直接访问action中的静态方法 -->
		<constant name="struts.ognl.allowStaticMethodAccess" value="true"></constant>
		<!-- 配置struts属性,只能用.action .do后缀访问action -->
		<constant name="struts.action.extension" value="action,do,,"></constant>
    	
    7.action的特点及其访问
    	访问struts框架的项目
    	http://127.0.0.1:8001/Struts2/test/MyTest.action
    											项目名/命名空间/Action的名字
    	默认情况下访问action的时候使用projectname/namspace/actionname.action或者.do
    	为了不和servlet的访问冲突,需要自定义配置
    	<!-- 配置struts属性,只能用.action .do后缀访问action -->
		<constant name="struts.action.extension" value="action,do"></constant>
    	
    	struts2框架中 的action是线程安全的,每次访问都会创建一个新的action.所以在action里面可以随意定义
    	成员变量.
    	特殊的action配置使用通配符配置,name必须有一定的规律.
    	<action name="test*" class="com.eagle.web.action.ActionTest{1}">
    		<result name="success">/success.jsp</result>
    		<result name="error">/error.jsp</result>
    	</action>
    	{1}代表name属性中出现的第一个*号,如果有第二个* ,可以用{2}表示.
    8,访问action的时候,action中的方法调用.
    	1,默认情况下会调用action中的execute方法,这个方法会返回一个字符串.根据这个字符串跳转.
    	2,可以在action标签里面加上一个method属性来指明将来调用ation的时候调用哪个方法.
    	<action name="methodTest2" class="com.eagle.web.action.MethodActionTest" method="go">
    		<result>/success.jsp</result>
    	</action>
    	两个不同名字的action可以对应相同的java类
    	但是login方法和register方法是一样的,都是返回String.
    	3,在地址栏中动态指定要调用的method
    	例如:<action name="methodTest" class="com.eagle.web.action.MethodActionTest">
    		<result>/success.jsp</result>
    	</action>
    	http://127.0.0.1:8001/Struts2/test/methodTest!login.action
    9,配置全局的跳转.
    	   <global-results>
				<result name="success">/success.jsp</result>
				<result name="error">/error.jsp</result>
    	</global-results>
    	如果接受的字符串是success就跳转到success.jsp
    	配置的位置在package下面,紧挨着package
    10,配置package中默认的action.
    	<default-action-ref name="methodTest1"></default-action-ref>
    	作用:如果访问到了当前包下的不存在的action就会跳转到指定的action.
    	注意:访问的时候某个package下面的action找不到和找到了action但是找不到action所对应的类是不一样
    	的.
   11,action中的跳转方式.
   <result name="success" type="dispatcher">/success.jsp</result>
   name属性是跳转的名字,type是跳转的类型,有四种类型可以选则:
   		dispatcher:
   			从一个action跳转到另外一个页面中(服务器内部),是type属性的默认值.
   		chain:
   			从一个action跳转到另外一个action中(服务器内部)
   			1,同包下跳转:<result type="chain">methodTest</result>
   			2,不同的package下跳转,
   			<result type="chain">
	    		 <param name="namespace">/user</param>
	    		 <param name="actionName">mytest</param>
    		 </result>
   		redirect:
   			从一个action重定向到另外一个页面中
   			<action name="redirectTest" class="com.eagle.web.action.RedirectAction">
    			<result type="redirect">/success.jsp</result>
    		</action>
   		redirectAction:
   			从一个action重定向到另外一个页面中
    	<action name="redirectActionTest" class="com.eagle.web.action.RedirectAction">
    		<result type="redirectAction">methodTest1</result>
    	</action>
   12,struts中的拦截器(interceptor)
	   	1)什么是拦截器(interceptor)
	   			拦截器是struts2框架中提供的一种java类,作用是用来拦截访问action的请求的.拦截住之后可以做一
	   			些其他处理
	   	2),拦截器是如何工作的?	
	   		a,要有一个拦截器类(自带的或者自己写的)
	   		b,要在配置文件中把这个拦截器配置出来.
	   		c,需要指明这个拦截器去拦截哪些action.
	   		d,客户端发送一个请求,访问一个被拦截器拦截的action
	   		e,这个请求会先被struts2的filter所拦截,filter会先检查这个请求是不是请求的action,如果是action的话
	   		,再检查这个action有没有被其他拦截器请求拦截,如果有就给他.
	   	3),如何自定义一个拦截器
	   		struts2已经定义好了很多个拦截器,同时也把这些拦截器配置在了文件里面,除此以外我们还可以写自
	   		己的拦截器.
	   		
	   		要写interceptor首先要实现接口com.opensymphony.xwork2.interceptor.Interceptor;
	   		然后在配置文件里面配置,
	   		<interceptors>
    			<interceptor name="MyInterceptor" class="com.eagle.web.interceptor.MyInterceptor"></
    			interceptor>
    		</interceptors>
    	在action里引用,
    	<action name="MyTest">
    		<result>/index.jsp</result>
    		<interceptor-ref name="MyInterceptor"></interceptor-ref>
    	</action>
    4)拦截器栈
    	当一个action需要被多个拦截器拦截的时候为避免重复冗余引用,这里提出拦截器栈的思想,
    	如:<interceptor-stack name="myStack">
    			<interceptor-ref name="MyInterceptor"></interceptor-ref>
    			<interceptor-ref name="params"></interceptor-ref>
    			<interceptor-ref name="basicStack"></interceptor-ref>
    		</interceptor-stack>
    		拦截器栈中可以引用定义好的拦截器,也可以引用其他拦截栈.如basicStack就是一个拦截器栈,这样简化
    		了代码.
    	5)默认拦截器栈.
    		在一个package中,我们可以定义一个默认的拦截器栈或者拦截器.
    		作用:将来这个package中的所有action都会被这个拦截器拦截.
    		<default-interceptor-ref name="defaultStack"/>
    		defaultStack可以是一个拦截器,也可以是一个拦截器栈.
    		默认情况下我们所写的任何action都会被defaultStack栈拦截器,正是这个拦截器给我们的action提供了
    		丰富的功能.因为我们所写的action都是直接诶或者间接的继承了struts-deault包,而这个包就把
    		defaultStack定义为默认拦截器栈,所以我们的action就继承了他.但是一旦指明某个action被我们所写的
    		拦截器/栈所拦截,那么这个拦截器就不会被defaultStack拦截了.我们可以主动的声明这个action被
    		defaultStack拦截.或者把defaultStack加入到自定义的拦截器中.
    	6),package之间的继承.
    		我们可以专门定义一个package,在这里我们只做拦截器的定义,然后让其他的package继承这个
    		package.这样其他包中的action就会被自定义的包中的拦截器拦截.
    13,拦截器和过滤器的区别.
    	相同点:
			1)都是java类.
			2)都能拦截客户端发过来的请求,
			3)都能在各自的链条里把请求进行传递.
			4)都需要实现接口,也都需要在配置文件中配置.
    	不同点:
			1)拦截器是struts2框架中定义的,过滤器是web里面J2EE标准定义的.
			2)拦截器只会拦截访问action的请求,但是过滤器能够拦截访问服务器的一切请求.
			3)拦截器定义在struts.xml文件中,过滤器定义在web.xml文件中.
			4)拦截器对象的创建调用销毁是struts2框架负责的,过滤器对象创建调用销毁是服务器负责的.
    	我们自己定义的filter拦截struts2中的action时候需要配置的时候配置在struts2自带的filter的上面,因为
    	web.xml文件中的filter配置的先后顺序,先执行自带后,自带的会把请求传给自己的interceptor中断了请求
    	的传送.
    14,前台页面向后台action中传参.
    	例如:
    		通过页面把id=1 name=choda age=90这三个参数传给action
    		1)action里面定义三个成员变量,这三个变量的的名字和所传变量的名字一至.
    		2)提供get和set方法
    		3)将来页面把这三个参数过来的时候,struts2框架会自动把三个参数的值放到属性里面.(同时还做了类
    		型转换)
    		传值之后我们只需要在execute方法里使用即可.
    		第二种情况:
    			在接收到页面传的值的时候,可以直接把值封装到javabean对象里面.
    			1)action中定义一个User类型的变量user,User类中有三个属性值id name age ,同时有get set方法
    			2)action中给这个user属性提供get set方法.
    			3)页面向action传值的时候,参数的名字要写成user.id=8 user.name=tom user.age=90
    				http://127.0.0.1:8001/Struts2/user/paramAction?user.id=3&user.name=d&user.age=345
    			将来接收到这个参数之后,struts2框架会帮我创建对象,并且把这三个值封装到对象的三个属性里面,
    			最后再封装到User变量里面.
    	15,从action向页面传值.
    			在action中可以使用request,session,application向页面传值,除此之外还有独有的方式:ValueStack 
    			ActionContext
    			1)ValueStack是一个接口
    		    	ActionContext是一个类
    		    2)我们在页面中可以通过struts2标签来看到action传到页面中的值<s:debug/>
    		    3)当action跳转的时候,struts2框架会把这个action本身分别放到ValueStack和ActionContext对象,然
    		    后再把这两个对象传给页面.所以我们通过这两个对象就可以拿到值了.
    		    在页面的deubg标签中哦可以看到struts2框架放到这两个对象里的action.
    		    4)除了struts2框架自动的往里面放值以外我们还可以手动的往里面放值.
    		    5)如何拿到ValueStack和ActionContext对象.
    		    	//获得ActionContext对象
    		    	ActionContext ac = ActionContext.getContext();
    		    	// 获得ValueStack对象
					ValueStack vs = ac.getValueStack();
				6)向ac和vs中主动放值.
					ac.put("戴鑫", "三炮");
					ValueStack vs = ac.getValueStack();
					String myName="chinago";
					vs.push(myName);
				7)ValueStack的特点:
					a,把对象放到vs里面之后,我们从这个vs中看不到他,但是可以可以看到他的属性值.
    		    	b,从vs中拿值的时候是通过vs中的Property name来拿值的,在debug的vs视图可以看到这些列.
    		    		所以如果想通过vs拿值,应该把值放到对象里,然后才可以拿到值.
    		    	c,每次向浏览器发送请求都是一个新的vs对象,
    		    	d,vs创建之后会放到ActionContext里面.
    		    8)ActionContext特点:
    		    	a,通过key value放值.
    		    	b,struts2框架默认向ac里放的对象很多,包括resquest application parameters session 
    		    		parameters等.
    		    	c,每次请求都会创建一个新的ac对象
    		 16.在action中访问web元素(resquest application  session ).
    		 	1)在struts2框架中这个三个对象都有两个类型:原类型 Map类型
    		 	2)原类型:
    		 	HttpServletRequest request
    		 	HttpSession session
    		 	ServletContext application
    		 	Map类型:
    		 	Map<String,Object> request
    		 	Map<String,Object> session
    		 	Map<String,Object> application
    		 	3)在使用的时候可以选择具体使用哪个类型
    		 	4)不管是哪个类型,都可以在ActionContext中找到
    		 	5)原类型和Map类型的关系
				 	a,使用Map类型的对象,可以降低代码中对ServletAPI的依赖.
				 	b,使用原类型大多的时候也是存值和取值,而且原类型本身也封装了Map对象.
				 	c,Map类型的request对象里的值(k-v),其实就是复制的原类型(k-v),原类型的request对象里面除了
				 		(k-v)类型的键值对之外还有其他的属性和方法因为他是HttpServletRequest类型的对象.
				 	d,所以他们的(k-v)是相通的.
				 6)在action中如何拿到原类型和Map类型的对象.
				 	a,获取Map类型的对象,
				  		第一种方式自己在方法中主动获得.
					 	ActionContext ac = ActionContext.getContext();
						Map<String,Object> request = (Map<String, Object>) ac.get("request");
						request.put("myName", "tom");
						<%=request.getAttribute("myName") %>
				    	//获取Map类型session
				    	Map<String, Object> session = ac.getSession();
				    	  //获取Map类型application
						Map<String, Object> application = ac.getApplication();
						第二种方式:让struts2框架把Map类型的对象自动的放到Action里面.(依赖注入)
						第一种方式是主动创建.
						第二种方式是被动接受.通过实现接口
						RequestAware,SessionAware,ApplicationAware,CookiesAware,并且实现方法,就可以拿到,拿到
						后可以直接使用
					b,获取原类型对象.
						第一种方式:自己主动获得.通过ServletActionContext
							//获得request对象
						HttpServletRequest request2 = ServletActionContext.getRequest();
						HttpServletResponse response = ServletActionContext.getResponse();
						//获得session对象
						HttpSession session2 = request2.getSession();
							//获得application对象
						ServletContext application2 = session2.getServletContext();
						ServletContext application3 = ServletActionContext.getServletContext();
						第二种被动接受.
						struts2框架中提供了一个接口,可以用来获得原类型的request对象,因为通过原类型的request对
						象就可以获得session和application对象.
						实现接口ServletRequestAware
	17,页面中获得action传过来的值.
		在struts2框架提供的取值方式中,需要用到struts2框架的标签和OGNL表达式.
		注意:同时我们也可以使用jsp内置对象取值,已经使用jstl标签+EL表达式取值.
				1,jsp内置对象取值.
				2,jstl标签+EL表达式取值.
				3,struts2框架的标签和OGNL表达式取值.
					OGNL表达式只能写在struts2框架的标签的属性中.<s:property value=""/>作用就是向页面中输出
					值.例如:<s:property value="OGNL表达式"/>
		1)从ValueStack和ActionContext中取值.
			a,从ValueStack中取值.
			//注意:这个value中的name就是OGNL表达式.
			<s:property value="name"/>
			locale=<s:property value="locale"/><br>
		 	user=<s:property value="user"/><br>
		 	user.id=<s:property value="user.id"/><br>
		 	user.name=<s:property value="user.name"/><br>
		 	user.age=<s:property value="user.age"/><br>
			注意:从ValueStack中取值的时候,如果ValueStack中有两个名字相同的值,我们只能取道最上面的.如果
			做一些特殊的处理还是可以取道下面的值的.
		2)从ActionContext中取值.
			要使用OGNL表达式通过AC中的key来拿相对应的value值.取值的时候要加上一个#号
			<s:property name="#request"/><br>
		 	<s:property name="#action"/><br>
		 	<s:property name="#action.name"/><br>
		 	<s:property name="#msg"/><br>
		 	<s:property name="#user"/><br>
		3)ActionContext中的parameters,attr,request,session,application等key值.
				parameters对应的值是客户端所传过来的参数.
					 	<s:property name="#parameters.name"/><br>接受客户端传过来的名字为name的参数值.
				//从request sesion appication中取值
				<s:property value="#request.myName"/><br>
			 	<s:property value="#session.myName"/><br>
			 	<s:property value="#application.myName"/><br>
				//默认依次request sesion appication从取值,娶不到就算了
				<s:property value="#attr.myName"/><br>
				
				还可以通过jsp脚本取值.
				从request中取值如果没有会到ValueStack中找,因为ValueStack的地址在request中,session和
				applicatin是没有这个特点的.
				<%=request.getAttribute("myName") %><br>
	 			<%=request.getAttribute("name") %><br>
    			<h3>使用EL表达式取值</h3>
			 	${requestScope.myName }<br>
			 	${requestScope.name }<br>
			 	${sessionScope.myName }<br>
			 	${applicationScope.myName }<br>
    18,OGNL表达式(Object Graph Navigation Language)
    	像之前学习的EL一样也是一种表达式语言,但是比EL表达式语言要强大.
    	EL基本上可以写在页面的任何一个位置,但是OGNL只能写在struts2框架标签的属性中.
    	OGNL表达式的作用:
					<h3>输出文本字符串</h3>
			 	<s:property value="'hello'"/><br>
			 	<s:property value="'1+9'"/><br>
		 	
		 	<h3>输出运算式</h3>
		 		<s:property value="1+9"/><br>
		 	
		 	<h3>输出布尔表达式结果</h3>
			 	<s:property value="1<9"/><br>
			 	<s:property value="1>9"/><br>
			 	<s:property value="1>9||1>-1"/><br>
			 	<s:property value="1>9&&1<-1"/><br>
			 	<s:property value="1>9?'三炮':'四炮'"/><br>
		 	
		 	<h3>从ValueStack中取值</h3>
			 	name=<s:property value="name"/><br>
			 	locale=<s:property value="locale"/><br>
			 	user=<s:property value="user"/><br>
			 	user.id=<s:property value="user.id"/><br>
			 	user.name=<s:property value="user.name"/><br>
			 	user.age=<s:property value="user.age"/><br>
		 	
		 	<h3>从ValueStack中取值的时候,有两个名字相同的值,做特殊处理,就可以取到</h3>
			 	<!-- [1]表示去拿到ValueStack中第二个对象的name属性值,vs中对象从上到下0,1,2... -->
			 	name=<s:property value="[1].name"/><br>
		 	
		 	<h3>取到ValueStack中的属性值,如果属性值是一个对象,就可以调用对象的方法</h3>
			 	<!-- 只要可以拿到对象就可以调用方法,不管是怎么拿到的 -->
			 	name=<s:property value="user.getName()"/><br>
			 	name=<s:property value="user.say()"/><br>
			 	<h4>调用类中的构造器对象,并且调用对象的方法</h4>
			 	<s:property value="new com.eagle.bean.User().getId()"/><br>
			 	
		 	<h3>取到ActionContex中的属性值,如果属性值是一个对象,就可以调用对象的方法</h3>
		 		<s:property value="#user.say()"/><br>
		 	
		 	<h3>直接调用字符串对象的方法</h3>
			 	<s:property value="'abc'.equals('bcd')"/><br>
			 	<s:property value="'三炮'.equals('三炮')"/><br>
		 	
		 	<h3>调用ValueStack中action/其他对象的静态方法</h3>
		 	<!-- 格式@vs1@静态方法的名字,vs1中1代表ValueStack中的第一个对象 -->
		 		<s:property value="@vs2@Static()"/><br>
		 	
		 	<h3>调用JDK中类或者自定义类中的方法</h3>
			 	<!-- 第一个@后加类的全名,可以不写,建议写(规范)
			 		 第二个@后面加上静态属性/静态方法
			 		 -->
		 		<s:property value="@@PI"/><br>
		 		<s:property value="@java.lang.Math@random()"/><br>
		 		<s:property value="@com.eagle.bean.User@myStatic()"/><br>
    19.struts2框架中的标签
    		<s:debug></s:debug>用来显示action传到页面中的值,调试的时候用.
    		<s:property value="">在页面中取值,输出内容.
    		接受到的是字符串类型的,需要先转换成int再比较
    		<s:if test="@java.lang.Integer@parseInt(#parameters.score)>=90">优秀</s:if>
			<s:elseif test="@java.lang.Integer@parseInt(#parameters.score)>=80">良好</s:elseif>
			<s:elseif test="@java.lang.Integer@parseInt(#parameters.score)>=60">及格</s:elseif>
			<s:else>不及格</s:else>
			
			作用:name属性中放的是key值,通过key来拿到对应的value值进行显示.
			<s:text name="name"></s:text>:<input type="text" name="username"/><br>
			<s:text name="pwd"></s:text>:<input type="text" name="password"/><br>
			浏览器请求到action之后,在运行期间,如果内部出现了错误,就爱你过来跳转之后此标签显示错误的消息
    		<s:fielderror/>
    		<s:iterator value="list">
				<s:property value="id"/>
				<s:property value="name"/>
				<s:property value="age"/><br>
			</s:iterator><hr>
			从AC中取值
			<s:iterator value="list" id="u">
				<s:property value="#u.id"/>
				<s:property value="#u.name"/>
				<s:property value="#u.age"/><br>
			</s:iterator>
    		注意:每次遍历接受到的集合中的对象,都会默认放到VS和AC中,所以我们可以从这两个地方取值.
    		map类型的取值:
    		遍历map类型集合<br>
				<s:iterator value="map" id="entry">
					<s:property value="key"/>-->
					<s:property value="value.id"/>
					<s:property value="value.name"/>
					<s:property value="value.age"/><br>
				</s:iterator><br>
				<s:iterator value="map" id="entry">
					<s:property value="#entry.key"/>-->
					<s:property value="#entry.value.id"/>
					<s:property value="#entry.value.name"/>
					<s:property value="#entry.value.age"/><br>
				</s:iterator>
    		<s:set/>标签:
    			作用:把一个键值对放到一定的范围里面,默认放到ac里面
    			//name属性表示值的名字
    			//value表示值的内容
    			<s:set name="myName" value="'tom'" ></s:set>
				<s:set name="myName" value="#entry.value.name" ></s:set>
				<s:set name="myName" value="'tom4'" scope="request"></s:set>
				<s:property value="#myName"/><br>
				<s:property value="#request.myName"/><br>
	   		//scope属性表示要存放值的范围,可以是reqest,session,application等,默认是ActionContext
	   		特殊的情况:
	   		<s:set name="my.msg" value="'hello'"></s:set>
			<s:property value="#attr['my.msg']"/><br>
	   		
	   		直接存一个List/Map集合;
	   		List:
	   		<s:set name="myList" value="{'tom1','tom2','tom3'}"></s:set>
			<s:property value="#myList[0]"/><br>
			<s:property value="#myList.size"/><br>
	   		Map:
	   		//#号除了可以表示从ac中取值外还可以用来声明Map集合
	   		<s:set name="myMap" value="#{'1':'tom1','2':'tom2','3':'tom3'}"></s:set>
   			<s:property value="#myMap.size"/><br>
			<s:property value="#myMap.keys"/><br>
			<s:property value="#myMap.values"/><br>
			<s:property value="#myMap['1']"/><br>
   			
    		<s:include >标签的作用:把另外一个页面直接包含在当前标签所在的位置
			例如:
					<s:include value="">
						<s:param name="name" value="lisi">
					</s:param></s:include>
    				同时还可以传参数,取值时request.getParameter("name");
    				form标签:
    				<s:form action="user/tagFormAction" method="post">
						<s:textfield name="username" label="用户名" ></s:textfield>
						<s:password name="password" label="密码"></s:password>
						<!-- list="{'男','女'}" 把男和女传给action -->
						<s:radio name="gender" list="#{'0':'男','1':'女'}" label="性别"></s:radio>
						<!-- struts2标签中的多选框checkbox
							fen两种:
							1,单个的checkbox
							2,一组checkbox
						 -->
						<!--  一组checkbox-->
						<s:checkboxlist list="{'足球','篮球','排球'}" name="hoppy" label="爱好" value="{'排球'}">
						</s:checkboxlist>
						<s:select list="{'大连','昆山','上海'}" name="city" label="城市" headerKey="-1"
						 headerValue="城市"></s:select>
						<s:textarea name="dis" rows="5" cols="20" label="个人介绍" ></s:textarea>
						<s:checkbox name="autoLogin" fieldValue="yes" label="一周内自动登陆"></s:checkbox>
						<s:submit value="提交" method="execute"></s:submit>
						<s:submit value="注册" method="register"></s:submit>
						<s:submit type="image" src="11.gif"></s:submit>
					</s:form>
				url标签:
				<s:a href="index.jsp">主页1</s:a>
				<s:url value="http://www.baidu.com" var="myURL1"></s:url>
				<!-- myURL1是一个变量,在这里要用%{myURL1}来拿变量的值 -->
				<s:a href="%{myURL1}">百度</s:a>
	
				<!-- <s:url/>是会把这个变量放到AC里面,同时我们还可以从VS中拿值,类似于<s:set/>标签的效果 -->
				<s:url value="/index.jsp" var="myURL2"></s:url>
				<s:a href="%{myURL2}">百度</s:a>
	
				<s:url action="mytest" namespace="/user" var="myURL3"></s:url>
				<s:a href="%{myURL3}">test</s:a>
	
				<s:set name="myURL4" value="'http://www.baidu.com'"></s:set>
				<s:a href="%{myURL4}">百度4</s:a>
    	
    20,struts中的转换器(convertor)
    	1,转换器的作用
    		帮我们把客户端传多来的值进行类型转换.
    	2,sttrut2已经写好了很多转换器,在我们需要的时候,框架如果发现了某一个值需要转换,就会调用转换器进
    	行转换.
    	例如:本来写好年龄为34,传过去的是字符串,但是传到action之后就会变成int类型的值.
	   同时还可以按照我们的要求把一个值转换成另外一个值.
	   3,如何写一个自定义转换器.
	   		前提,页面中有一个输入框,输入框中类似于输入这种数据:1:tom:20,提交数据之后,这个值会变成一个
	   		User对象,然后放到action里面.
	   		1,写一个转换器类.
	   			继承父类,抽象类StrutsTypeConverter,实现方法.
	   			例如:
	   			@Override
				public Object convertFromString(Map map, String[] str, Class c) {
					//1:tom:10
					System.out.println("in MyConvertor convertFromString() str.length="+str.length);
					String s=str[0];
					String[] str2=s.split("[:]");
					long id=Long.parseLong(str2[0]);
					String name=str2[1];
					int age=Integer.parseInt(str2[2]);
		
					User user= new User(id,name,age);
		
					return user;
				}

				@Override
				public String convertToString(Map map, Object o) {
					return o.toString();
				}
	   		2,在web.xml中进行配置
	   			a,配置成局部的转换器.
	   				特点:只对某一个action起作用.
	   				写一个Properties资源文件
	   				1,文件位置
	   					和要使用 的action放在同一个包下面.
	   				2,文件的名字.
	   					Xxxx-conversion.properties
	   					Xxxx指的就是action的类名
	   				3,文件内容.
	   					例如:
	   					user=com.eagle.convertor.MyConvertor
	   					表示当数据提交到这个名字为Xxxx的action的里面的时候,如果action中有一个属性叫user的属
	   					性值,那么这个属性值就要通过com.eagle.convertor.MyConvertor这个转换器后获得.
	   			b,配置成全局的转换器.
	   				特点:对所有的action都起作用.
	  				写一个Properties资源文件
	   				1,文件位置
	   					直接放在src下面.
	   				2,文件的名字.
	   					xwork-conversion.properties
	   					文件名字是固定的.
	   				3,文件内容.
	   					例如:
	   					com.eagle.bean.User=com.eagle.convertor.MyConvertor
	   					表示当数据提交到任何action的里面的时候,如果action中有一个属性叫user的属
	   					性值,那么这个属性值就要通过com.eagle.convertor.MyConvertor这个转换器后获得.
	  21.struts2框架中的数据验证(validation)
	  		作用:客户端提交的数据在到达action之前,struts2框架可以先帮我们验证这个数据是否符合我们的格式
	  		要求,如果符合就让action接受这个action,如果不符合,就会提示错误,然后默认返回input字符串.
	  		1,我们需要用到xwork-2.1.2.jar包中的类来进行数据的验证.
	  		2,写一个xml文件.
	  			作用:描述清楚action中的哪一个属性需要被xwork-2.1.2.jar包中的哪一个类进行验证,并且定义出验
	  			证不通过后的返回信息的内容.
	  			a,文件的位置.
	  			和这个名字为Xxxx的action相同的包下面.
	  			b,文件的名字.
	  			Xxxx-validation.xml
	  			Xxxx指的就是数据提交到的action的类名.
	  			3,文件的内容.
	  			这个xml文件的内容是由一个dtd文件控制的.所以要引入这个dtd文件.就可以自动提示要生成的标签.
	  
	  			在这个xml文件中引入dtd的头部声明,在xwork-2.1.2.jar里面
						  <validators>
					<!-- 给当前action的哪一个属性做验证 -->
						<field name="username">
							<!-- 使用哪一个验证器来验证这个属性值
							验证器的名字可以从
							com.opensymphony.xwork2.validator.validators.default.xml
							找到-->
							<field-validator type="requiredstring">
								<!-- 如果验证没有通过,返回的字符串信息-->
								<message>用户名不能为空</message>
							</field-validator>
						</field>
						<field name="password">
							<field-validator type="requiredstring">
								<!-- 如果验证没有通过,返回的字符串信息-->
								<message>密码不能为空</message>
							</field-validator>
						</field>
						<!--同一个属性可以使用多个验证器验证 -->
						<field name="password">
							<field-validator type="stringlength">
								<!-- 可以给验证器传参数 -->
								<!-- 参数名字可以在验证器类中看到 -->
								<!-- 在default.xml找到是哪一个类-->
								<param name="minLength">6</param>
								<param name="maxLength">10</param>
								<!-- 如果验证没有通过,返回的字符串信息-->
								<message>密码长度必须是6-10个字符之间</message>
							</field-validator>
						</field>
					</validators>	
	  22.struts2框架的国际化配置(i18n)
	  	internationalization i-18-n
	  	作用:不同国家的或者地区的人访问同一个web项目,在页面中显示文字符号是不同的,和当前国家或这地区
	  	保持一致.
	  	1,配置两个资源文件.
	  		xxxx_zh_.properties
	  		xxxx_en_.properties
	  	2,这两个文件放在src下面.
	  	3,文件内容:
	  	例如:	message_en_.properties文件当中存放的是英文信息.
	  				name=UserName
	  				pwd=Password
				   message_ch_.properties文件当中存放的是中文信息.
				   name=用户名
	  				pwd=密码
	  				properies里面是不能直接写中文的,需要转换.
	  			注意:通过key来拿值.
	  	4,在struts.xml文件中配置国际化的资源文件.
	  		<!-- 配置国际化的信息 -->
			<constant name="struts.custom.i18n.resources" value="message"></constant>
	  		message是文件名的前缀.
	  	5,在页面中使用struts2的标签,通过key来拿到资源文件的value值进行显示.
		 	 <s:text name="name"></s:text>:<input type="text" name="username"/><br>
			<s:text name="pwd"></s:text>:<input type="text" name="password"/><br>
	  6,将来浏览器中到底显示的是中文还是英文,要看浏览器中默认优先使用的语言是哪一种.
	  
	  
	  
	  
	  
	  
	
	
