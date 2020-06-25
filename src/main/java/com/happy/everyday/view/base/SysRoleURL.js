/**
 * 接口域名的管理
 */

// const baseUrl = 'http:127.0.0.1:8888/api'
const baseUrl = '/api'
const base = {
  baseUrl: baseUrl,
  // 获取所有字典
  SysRoleList: baseUrl + '/SysRole/list',
  SysRolePage: baseUrl + '/SysRole/page',
  SysRoleGet: baseUrl + '/SysRole/get',
  SysRoleAdd: baseUrl + '/SysRole/add',
  SysRoleModify: baseUrl + '/SysRole/modify',
  SysRoleDelete: baseUrl + '/SysRole/delete',
}

export default base