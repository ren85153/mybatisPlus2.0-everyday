import base from '@/api/base' // 导入接口域名列表
import axios from '@/libs/http' // 导入http中创建的axios实例
//  axios请求
const SysMenuAxios = {


  list (param) {
    return axios({
      url: `\$\{base.SysMenuList}`,
      method: 'post',
      data: param
    })
  },
  page (param) {
    return axios({
      url: `\$\{base.SysMenuPage}`,
      method: 'post',
      data: param
    })
  },
  get (param) {
    return axios({
      url: `\$\{base.SysMenuGet}?id=` + param,
      method: 'get',
      data: param
    })
  },
  add (param) {
    return axios({
      url: `\$\{base.SysMenuAdd}`,
      method: 'post',
      data: param
    })
  },
  modify (param) {
    return axios({
      url: `\$\{base.SysMenuModify}`,
      method: 'post',
      data: param
    })
  },
  delete (param) {
    return axios({
      url: `\$\{base.SysMenuDelete}?id=` + param,
      method: 'get',
      data: param
    })
  }
}

export default SysMenuAxios





