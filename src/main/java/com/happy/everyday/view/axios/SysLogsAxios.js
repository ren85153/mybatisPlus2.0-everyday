import base from '@/api/base' // 导入接口域名列表
import axios from '@/libs/http' // 导入http中创建的axios实例
//  axios请求
const SysLogsAxios = {


  list (param) {
    return axios({
      url: `\$\{base.SysLogsList}`,
      method: 'post',
      data: param
    })
  },
  page (param) {
    return axios({
      url: `\$\{base.SysLogsPage}`,
      method: 'post',
      data: param
    })
  },
  get (param) {
    return axios({
      url: `\$\{base.SysLogsGet}?id=` + param,
      method: 'get',
      data: param
    })
  },
  add (param) {
    return axios({
      url: `\$\{base.SysLogsAdd}`,
      method: 'post',
      data: param
    })
  },
  modify (param) {
    return axios({
      url: `\$\{base.SysLogsModify}`,
      method: 'post',
      data: param
    })
  },
  delete (param) {
    return axios({
      url: `\$\{base.SysLogsDelete}?id=` + param,
      method: 'get',
      data: param
    })
  }
}

export default SysLogsAxios





