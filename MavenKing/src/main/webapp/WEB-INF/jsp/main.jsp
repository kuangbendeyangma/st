<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<link href="css/nwd_common.css" rel="stylesheet" type="text/css"> 

		<link type="text/css" rel="stylesheet" href="../css/style.css"/>
		<link rel="stylesheet" href="/css/index.css" />
		<link rel="stylesheet" href="/css/styletwo.css" />
		<link rel="stylesheet" href="/css/jw.css" />
		<script type="text/javascript" src="/js/nwd_common.js" ></script>
		<title></title>
		<style type="text/css">
			ul#nav{ width:100%; height:60px; background:#FFFFF;margin:0 auto} 
			ul#nav li{display:inline; height:60px} 
			ul#nav li a{display:inline-block; padding:0 20px; height:60px; line-height:60px;
 			color:#999999; font-family:"\5FAE\8F6F\96C5\9ED1"; font-size:16px} 
			ul#nav li a:hover{background:#F5F5F5}/*设置鼠标滑过或悬停时变化的背景颜色*/
		</style>
		<style type="text/css">
.picutre_many img{width:200px; height:150px;padding: 2px;}
	</style>
</head>
<body>

<div class="nwd_top">
                                 <!--顶部
                                 -->
				<div class="nwd_main pad_t10 clearfix">
					<span class="fl fs_16 fc_9"><i class="icon icon_tel">&nbsp;</i>客服热线<em class="Numfont mar_l10">&nbsp;123-456-7890</em><!--&nbsp;<em class="Numfont mar_l10">&nbsp;021-33328500</em>--></span>
					<span class="fr fc_9 mar_l10">市场有风险，投资需谨慎</span>
					<span class="fr"><a href="http://weibo.com/niwodai" target="_blank" class="link_weixin"><i class="icon icon_weixin">&nbsp;</i></a></span>
					<span class="fr mar_r10"><a href="javascript:()" class="link_weibo mar_r10" target="_blank"><i class="icon icon_weibo">&nbsp;</i><img src="../images/weixin.jpg" width="18px" height="18px" />&nbsp;微信客服<img src="images/topbg_b14925.png" class="weixinImg"></a></span>
					<span class="fr"><a href="http://www.niwodai.com/event.mhtml?artId=5820160000008230&amp;h&amp;f" class="link_mobile mar_r20" target="_blank"><i class="icon icon_moible">&nbsp;</i><img src="images/shouji.jpg" width="18px" height="18px" />&nbsp;手机客户端<img src="images/topbg_b14926.png" usemap="#Map" class="mobileImg">
					<map name="Map">
                      <area shape="rect" coords="154,40,256,153" href="http://www.niwodai.com/event.mhtml?artId=5820160000008230&amp;h&amp;f" target="_blank">
                      <area shape="rect" coords="424,41,517,150" href="http://www.niwodai.com/event.mhtml?&amp;artId=3800000794998139" target="_blank">
                    </map>
					</a></span>
					  <input type="hidden" value="" id="stok">
					  <input type="hidden" value="" id="log_userid">
			          <input type="hidden" value="" id="log_username">
			          	  <span class="fr fc_9" id="login_bt">您好，<a href="https://member.niwodai.com/login.html" class="mar_l10 toplogin" title="登录">请登录</a><a href="http://www.niwodai.com/multiRegister.html?artId=5820160000010275" class="mar_r10 mar_l10 toplogin" title="注册">免费注册</a></span>
				</div>
			</div>
			
				<div>
                     <!--导航条
                     -->
					<ul id="nav"> 
						<li>&nbsp;<li>
							<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<li>
    				<li><a href="#">&nbsp;&nbsp;首页&nbsp;&nbsp;</a></li> 
   					 <li><a href="#">HTML教程</a></li> 
   					 <li><a href="#">CSS基础</a></li> 
   					 <li><a href="#">CSS开发工具</a></li> 
   					 <li><a href="#">CSS特效</a></li> 
   					 <li><a href="#">CSS问题</a></li> 
					<li><a href="#">首页</a></li> 
   					 <li><a href="#">HTML教程</a></li> 
   					 </ul>
				</div>
			
		<div class="demo">
                          <!--
                          	轮播图
                          -->
	<a class="control prev"></a><a class="control next abs"></a><!--自定义按钮，移动端可不写-->
	<div class="slider"><!--主体结构，请用此类名调用插件，此类名可自定义-->
		<ul>
			<li><a href=""><img src="images/1.jpg" alt="两弯似蹙非蹙笼烟眉，一双似喜非喜含情目。" /></a></li>
			<li><a href=""><img src="images/2.jpg" alt="态生两靥之愁，娇袭一身之病。" /></a></li>
			<li><a href=""><img src="images/3.jpg" alt="泪光点点，娇喘微微。" /></a></li>
			<li><a href=""><img src="images/4.jpg" alt="闲静似娇花照水，行动如弱柳扶风。" /></a></li>
			<li><a href=""><img src="images/5.jpg" alt="心较比干多一窍，病如西子胜三分。" /></a></li>
		</ul>
	</div>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/YuxiSlider.jQuery.min.js"></script>
<script>
$(".slider").YuxiSlider({
	width:"100%", //容器宽度
	height:350, //容器高度
	control:$('.control'), //绑定控制按钮
	during:4000, //间隔4秒自动滑动
	speed:800, //移动速度0.8秒
	mousewheel:true, //是否开启鼠标滚轮控制
	direkey:true //是否开启左右箭头方向控制
});
</script>
<!--
	公告
-->
<div class="index_gonggao clearfix">
			<div class="index_main w1180 clearfix">
		                    <dl class="fl index_gonggaoCon pad10">
								<dd class="fl fc_3 pad_l20 wid_w110"><span class="nwd_icon nwd_icon_gonggao mar_r10">&nbsp;</span>理财公告</dd>
								<dt class="fl wid_w940">
									<a target="_blank" class="fl">公告！！！！！！！！！！！</a>
								</dt>
							</dl>
				<span class="fr moregonggao mar_r20"><a href="#" target="_blank">更多&gt;&gt;</a></span>
			</div>
		</div>

<div class="index_main w1180 clearfix">
	<div class="bor_t bor_l bor_r clearfix" style="background: #fff;">
		<div class="fl jiacaiTitleCon pad_t10 pad_b10 clearfix">
             <span class="fr mar_l15 fc_9">每天24时更新&nbsp;&nbsp;&nbsp;&nbsp;</span>
             <span class="fl fs_18 fc_3 mar_l20"><font color="red">热门</font>&nbsp;<img width="45px" height="45px" src="images/hot.jpg"/></span><!--<span class="fr mar_l15 fc_9">市场有风险，投资需谨慎</span>-->
		</div>
	</div>
	<div class="mar_b20 clearfix">
		<ul class="jiacaiauto_pro clearfix">
							<li class="pad_t15  pad_b15 " onclick="window.open()" style="height: 320px;">
							<div class="jiacaiauto_name pad_l20">
								
									</div>
						</li>
							<li class="pad_t15  pad_b15 " onclick="window.open()" style="height: 320px;">
							<div class="jiacaiauto_name pad_l20">
							
									</div>
						</li>
							<li class="pad_t15  pad_b15 " onclick="window.open()" style="height: 320px;">
							<div class="jiacaiauto_name pad_l20">
									</div>
						</li>
							<li class="pad_t15  pad_b15 " onclick="window.open()" style="height: 320px;">
							<div class="jiacaiauto_name pad_l20">
									</div>
						</li>
							<li class="pad_t15  pad_b15 " onclick="window.open()" style="height: 320px;">
							<div class="jiacaiauto_name pad_l20"><span class="fc_3 fs_18">嘉财宝</span>
								
							<p class="fc_9 lin_36 elli">新晋网红  长期稳健收益佳</p></div>
							<div class="jiacai_mony txt_center">
									<span class="fs_48 fc_f60 Numfont">11</span><em class="fc_f60 fs_18">%</em>
								全局加息start
								定义参数
								
								<p class="fc_9 lin_24">近3个月年化收益</p>
							</div>
							<div class="jiacai_time txt_center fc_5 pad_t5 pad_b15">封闭期：545天</div>
									<div class="jiacai_add txt_center">
									<a class="btn btn_size120 btn_bgf60 mar_t5">立即抢购</a>
									</div>
						</li>
			</ul>
	</div>	
</div>
<!--
	底部轮播图
-->
	

	<div class="index_main w1180">
			<div class="clearfix box mar_b20">
				<div class="clearfix">
					<ul class="index_tese clearfix">
						<div style="text-align: center;">
							<div style="padding: 15px; font-size: large;"> &nbsp;<----------  合作商风采   ----------></div>
							 <div id="list" class=" picutre_many"
        style="overflow: hidden; height: 150px; width: 800px; margin: 0 auto;">
        <table cellspacing="0" cellpadding="0"
            style="width: 680px; border: 0px;">
            <tr>
                <td id="list1">
                    <table style="border: 0px;" cellpadding="0" cellspacing="0">
                        <tr id="pic">
                            <td><img style="border: 0px;" alt="" src="images/2.jpg" /></td>
                            <td><img style="border: 0px;" alt="" src="images/3.jpg" /></td>
                            <td><img style="border: 0px;" alt="" src="images/5.jpg" /></td>
                            <td><img style="border: 0px;" alt="" src="images/1.jpg" /></td>
                            <td><img style="border: 0px;" alt="" src="images/4.jpg" /></td>
                        </tr>
                    </table>
                </td>
                <td id="list2"></td>
            </tr>
        </table>
    </div>
							</div>
						</ul>
				</div>
			</div>
		</div>
		
		
 <script type="text/javascript">
        /*图片滚动效果*/
        var speedpic = 20;//速度数值越大速度越慢
        document.getElementById("list2").innerHTML = document.getElementById("list1").innerHTML;
        function Marqueepic() {
            if (document.getElementById("list2").offsetWidth
                    - document.getElementById("list").scrollLeft <= 0) {
                document.getElementById("list").scrollLeft -= document
                        .getElementById("list1").offsetWidth;
            } else {
                document.getElementById("list").scrollLeft++;
            }
        }
        var MyMarpic = setInterval(Marqueepic, speedpic);
        document.getElementById("list").onmouseover = function() {
            clearInterval(MyMarpic);
        }
        document.getElementById("list").onmouseout = function() {
            MyMarpic = setInterval(Marqueepic, speedpic);
        }
    </script>
<!--
	盈+优势
-->
<div class="yao-spree clearfix">
		<div class="yao-tit"><span>宜人财富优势</span></div>
			<div class="yao-yous">
				<div class="yao-youslbl">
					<div class="yao-youslblt">
						<img src="images/tu1.png" />
					</div>
					<p>期待年回报率<br>5.6%-9.2%</p>
				</div>
			</div>
			<div class="yao-yous">
				<div class="yao-youslbl">
					<div class="yao-youslblt yao-youslblt1">
						<img src="images/tu2.png" />
					</div>
					<p>0充值费用<br>0提现费用</p>
				</div>
			</div>
			<div class="yao-yous">
				<div class="yao-youslbl">
					<div class="yao-youslblt yao-youslblt2">
						<img src="images/tu3.png" />
					</div>
					<p>新注册出借用户送<br>100元现金券<br>月月都有精彩活动</p>
				</div>
			</div>
			<div class="yao-yous">
				<div class="yao-youslbl">
					<div class="yao-youslblt yao-youslblt3">
						<img src="images/tu4.png" />
					</div>
					<p>出借不是高大上<br>100元起</p>
				</div>
			</div>
			<div class="yao-yous">
				<div class="yao-youslbl">
					<div class="yao-youslblt yao-youslblt4">
						<img src="images/tu5.png" />
					</div>
					<p>不用放长线<br>随用随取</p>
				</div>
			</div>
			<div class="yao-yous">
				<div class="yao-youslbl">
					<div class="yao-youslblt yao-youslblt5">
						<img src="images/tu6.png" />
					</div>
					<p>11年大平台<br>为您出借保驾护航</p>
				</div>
			</div>

</div>
<center>
<div class="container index">
			<div class="row">
				<div class="security">
					<div class="item">
						<img src="images/index1.png">
						<div class="detail">
							资金银行监管
							<div class="desc">
								平台资金由第三方银行监管
							</div>
						</div>
					</div>
					<div class="item">
						<img src="images/index2.png">
						<div class="detail">
							交易证监会监管
							<div class="desc">
								投资交易由证监会监管
							</div>
						</div>
					</div>
					<div class="item">
						<img src="images/index3.png">
						<div class="detail">
							风控盈+监管
							<div class="desc">
								盈+全自动风控系统为您保驾护航
							</div>
						</div>
					</div>
				</div>

				
			</div>
		</div>
</center>

<center>
<div style="width: 90%;height: 100px; background-color: white;">
	
		
		<img src="images/qhit.png" />
		<font color="black" size="5	">
		<br>Copyright ©2017 襄阳三阳科技培训学校 st1604 2+3项目组版权所有
			</font>
		
	
</div>
</center>
</body>
</html>