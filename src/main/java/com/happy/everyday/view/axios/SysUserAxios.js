import base from '@/api/base' // 导入接口域名列表
import axios from '@/libs/http' // 导入http中创建的axios实例
//  axios请求
const SysUserAxios = {


  list (param) {
    return axios({
      url: `\$\{base.SysUserList}`,
      method: 'post',
      data: param
    })
  },
  page (param) {
    return axios({
      url: `\$\{base.SysUserPage}`,
      method: 'post',
      data: param
    })
  },
  get (param) {
    return axios({
      url: `\$\{base.SysUserGet}?id=` + param,
      method: 'get',
      data: param
    })
  },
  add (param) {
    return axios({
      url: `\$\{base.SysUserAdd}`,
      method: 'post',
      data: param
    })
  },
  modify (param) {
    return axios({
      url: `\$\{base.SysUserModify}`,
      method: 'post',
      data: param
    })
  },
  delete (param) {
    return axios({
      url: `\$\{base.SysUserDelete}?id=` + param,
      method: 'get',
      data: param
    })
  }
}

export default SysUserAxios





