/**
 * 接口域名的管理
 */

// const baseUrl = 'http:127.0.0.1:8888/api'
const baseUrl = '/api'
const base = {
  baseUrl: baseUrl,
  // 获取所有字典
  SysUserRoleList: baseUrl + '/SysUserRole/list',
  SysUserRolePage: baseUrl + '/SysUserRole/page',
  SysUserRoleGet: baseUrl + '/SysUserRole/get',
  SysUserRoleAdd: baseUrl + '/SysUserRole/add',
  SysUserRoleModify: baseUrl + '/SysUserRole/modify',
  SysUserRoleDelete: baseUrl + '/SysUserRole/delete',
}

export default base