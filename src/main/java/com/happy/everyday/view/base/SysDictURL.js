/**
 * 接口域名的管理
 */

// const baseUrl = 'http:127.0.0.1:8888/api'
const baseUrl = '/api'
const base = {
  baseUrl: baseUrl,
  // 获取所有字典
  SysDictList: baseUrl + '/SysDict/list',
  SysDictPage: baseUrl + '/SysDict/page',
  SysDictGet: baseUrl + '/SysDict/get',
  SysDictAdd: baseUrl + '/SysDict/add',
  SysDictModify: baseUrl + '/SysDict/modify',
  SysDictDelete: baseUrl + '/SysDict/delete',
}

export default base