# language: zh-CN
@admin
功能: 登陆admin系统

  @please_login
  场景: 登录admin
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面

  @index
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面"RegisterSource"
    并且 点击搜索按钮

  @userinfo
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面"RegisterSource"
    并且 点击用户管理
    那么 进入用户信息页面

  @userinfo_search
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面"RegisterSource"
    并且 点击用户管理
    那么 进入用户信息页面
    同时 输入手机号
    并且 单击查询

  @custom_reqirement
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面"RegisterSource"
    并且 点击运营管理质检融资需求书
    那么 进入质检融资需求书页面

  @custom_reqirement_auditing
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面"RegisterSource"
    并且 点击运营管理质检融资需求书
    那么 进入质检融资需求书页面
    同时 输入融资人用户手机号
    并且 单击查询按钮
    那么 拨打客服电话




