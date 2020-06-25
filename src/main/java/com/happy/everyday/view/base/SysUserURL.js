/**
 * 接口域名的管理
 */

// const baseUrl = 'http:127.0.0.1:8888/api'
const baseUrl = '/api'
const base = {
  baseUrl: baseUrl,
  // 获取所有字典
  SysUserList: baseUrl + '/SysUser/list',
  SysUserPage: baseUrl + '/SysUser/page',
  SysUserGet: baseUrl + '/SysUser/get',
  SysUserAdd: baseUrl + '/SysUser/add',
  SysUserModify: baseUrl + '/SysUser/modify',
  SysUserDelete: baseUrl + '/SysUser/delete',
}

export default base