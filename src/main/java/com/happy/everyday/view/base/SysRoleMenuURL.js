/**
 * 接口域名的管理
 */

// const baseUrl = 'http:127.0.0.1:8888/api'
const baseUrl = '/api'
const base = {
  baseUrl: baseUrl,
  // 获取所有字典
  SysRoleMenuList: baseUrl + '/SysRoleMenu/list',
  SysRoleMenuPage: baseUrl + '/SysRoleMenu/page',
  SysRoleMenuGet: baseUrl + '/SysRoleMenu/get',
  SysRoleMenuAdd: baseUrl + '/SysRoleMenu/add',
  SysRoleMenuModify: baseUrl + '/SysRoleMenu/modify',
  SysRoleMenuDelete: baseUrl + '/SysRoleMenu/delete',
}

export default base