/**
 * 接口域名的管理
 */

// const baseUrl = 'http:127.0.0.1:8888/api'
const baseUrl = '/api'
const base = {
  baseUrl: baseUrl,
  // 获取所有字典
  SysLogsList: baseUrl + '/SysLogs/list',
  SysLogsPage: baseUrl + '/SysLogs/page',
  SysLogsGet: baseUrl + '/SysLogs/get',
  SysLogsAdd: baseUrl + '/SysLogs/add',
  SysLogsModify: baseUrl + '/SysLogs/modify',
  SysLogsDelete: baseUrl + '/SysLogs/delete',
}

export default base