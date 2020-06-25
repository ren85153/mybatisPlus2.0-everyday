import base from '@/api/base' // 导入接口域名列表
import axios from '@/libs/http' // 导入http中创建的axios实例
//  axios请求
const SysRoleAxios = {


  list (param) {
    return axios({
      url: `\$\{base.SysRoleList}`,
      method: 'post',
      data: param
    })
  },
  page (param) {
    return axios({
      url: `\$\{base.SysRolePage}`,
      method: 'post',
      data: param
    })
  },
  get (param) {
    return axios({
      url: `\$\{base.SysRoleGet}?id=` + param,
      method: 'get',
      data: param
    })
  },
  add (param) {
    return axios({
      url: `\$\{base.SysRoleAdd}`,
      method: 'post',
      data: param
    })
  },
  modify (param) {
    return axios({
      url: `\$\{base.SysRoleModify}`,
      method: 'post',
      data: param
    })
  },
  delete (param) {
    return axios({
      url: `\$\{base.SysRoleDelete}?id=` + param,
      method: 'get',
      data: param
    })
  }
}

export default SysRoleAxios





