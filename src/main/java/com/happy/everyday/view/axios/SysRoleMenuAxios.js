import base from '@/api/base' // 导入接口域名列表
import axios from '@/libs/http' // 导入http中创建的axios实例
//  axios请求
const SysRoleMenuAxios = {


  list (param) {
    return axios({
      url: `\$\{base.SysRoleMenuList}`,
      method: 'post',
      data: param
    })
  },
  page (param) {
    return axios({
      url: `\$\{base.SysRoleMenuPage}`,
      method: 'post',
      data: param
    })
  },
  get (param) {
    return axios({
      url: `\$\{base.SysRoleMenuGet}?id=` + param,
      method: 'get',
      data: param
    })
  },
  add (param) {
    return axios({
      url: `\$\{base.SysRoleMenuAdd}`,
      method: 'post',
      data: param
    })
  },
  modify (param) {
    return axios({
      url: `\$\{base.SysRoleMenuModify}`,
      method: 'post',
      data: param
    })
  },
  delete (param) {
    return axios({
      url: `\$\{base.SysRoleMenuDelete}?id=` + param,
      method: 'get',
      data: param
    })
  }
}

export default SysRoleMenuAxios





