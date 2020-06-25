/**
 * 接口域名的管理
 */

// const baseUrl = 'http:127.0.0.1:8888/api'
const baseUrl = '/api'
const base = {
  baseUrl: baseUrl,
  // 获取所有字典
  SysMenuList: baseUrl + '/SysMenu/list',
  SysMenuPage: baseUrl + '/SysMenu/page',
  SysMenuGet: baseUrl + '/SysMenu/get',
  SysMenuAdd: baseUrl + '/SysMenu/add',
  SysMenuModify: baseUrl + '/SysMenu/modify',
  SysMenuDelete: baseUrl + '/SysMenu/delete',
}

export default base