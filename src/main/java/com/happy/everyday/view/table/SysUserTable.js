
import {formDatetime} from '../../components/utils/formdata';

// SysUser表格column
var SysUserTable = {}

SysUserTable.column  = [
  	//{ label: "", prop: "id",  operate: false },

	  {
	  	label: "姓名",
	  	prop: "userName",
	  	operate: false,
	  },

	  {
	  	label: "账号",
	  	prop: "account",
	  	operate: false,
	  },

	  {
	  	label: "密码",
	  	prop: "password",
	  	operate: false,
	  },

	  {
	  	label: "邮箱",
	  	prop: "email",
	  	operate: false,
	  },

	  {
	  	label: "手机号",
	  	prop: "telephone",
	  	operate: false,
	  },

	  {
	  	label: "地址",
	  	prop: "address",
	  	operate: false,
	  },

	  {
	  	label: "证件类型",
	  	prop: "cartType",
	  	operate: false,
	  },

	  {
	  	label: "证件号码",
	  	prop: "cartNo",
	  	operate: false,
	  },

	  {
	  	label: "国籍",
	  	prop: "nationality",
	  	operate: false,
	  },

	  {
	  	label: "生日",
	  	prop: "birth",
	  	operate: false,
	  },

	  {
	  	label: "性别",
	  	prop: "sex",
	  	operate: false,
	  },

	  {
	  	label: "状态",
	  	prop: "status",
	  	operate: false,
	  },

	  {
	  	label: "登录错误次数",
	  	prop: "errorCount",
	  	operate: false,
	  },

	  {
	  	label: "登录IP",
	  	prop: "loginIp",
	  	operate: false,
	  },

	  {
	  	label: "登录mac地址",
	  	prop: "loginMac",
	  	operate: false,
	  },

	  {
	  	label: "创建时间",
	  	prop: "createTime",
	  	operate: false,
	  },

	  {
	  	label: "创建人id",
	  	prop: "createId",
	  	operate: false,
	  },

	  {
	  	label: "创建人姓名",
	  	prop: "createName",
	  	operate: false,
	  },

	  {
	  	label: "修改时间",
	  	prop: "updateTime",
	  	operate: false,
	  },

	  {
	  	label: "修改人id",
	  	prop: "updateId",
	  	operate: false,
	  },

	  {
	  	label: "修改人姓名",
	  	prop: "updateName",
	  	operate: false,
	  },

	  {
	  	label: "账号类型",
	  	prop: "accountType",
	  	operate: false,
	  },

	  {
	  	label: "备注",
	  	prop: "remark",
	  	operate: false,
	  },

	  {
	  	label: "扩展",
	  	prop: "reserve",
	  	operate: false,
	  },

	  {
	  	label: "扩展1",
	  	prop: "reserve1",
	  	operate: false,
	  },

	  {
	  	label: "扩展2",
	  	prop: "reserve2",
	  	operate: false,
	  },

	  {
	  	label: "扩展3",
	  	prop: "reserve3",
	  	operate: false,
	  },

	  {
	  	label: "扩展4",
	  	prop: "reserve4",
	  	operate: false,
	  },

	  {
	  	label: "扩展5",
	  	prop: "reserve5",
	  	operate: false,
	  },

]

SysUserTable.tableData  = []
SysUserTable.searchForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  userName: '',
	  account: '',
	  password: '',
	  email: '',
	  telephone: '',
	  address: '',
	  cartType: '',
	  cartNo: '',
	  nationality: '',
	  birth: '',
	  sex: '',
	  status: '',
	  errorCount: '',
	  loginIp: '',
	  loginMac: '',
	  createTime: '',
	  createId: '',
	  createName: '',
	  updateTime: '',
	  updateId: '',
	  updateName: '',
	  accountType: '',
	  remark: '',
	  reserve: '',
	  reserve1: '',
	  reserve2: '',
	  reserve3: '',
	  reserve4: '',
	  reserve5: '',
}
SysUserTable.createForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  userName: '',
	  account: '',
	  password: '',
	  email: '',
	  telephone: '',
	  address: '',
	  cartType: '',
	  cartNo: '',
	  nationality: '',
	  birth: '',
	  sex: '',
	  status: '',
	  errorCount: '',
	  loginIp: '',
	  loginMac: '',
	  createTime: '',
	  createId: '',
	  createName: '',
	  updateTime: '',
	  updateId: '',
	  updateName: '',
	  accountType: '',
	  remark: '',
	  reserve: '',
	  reserve1: '',
	  reserve2: '',
	  reserve3: '',
	  reserve4: '',
	  reserve5: '',
}

SysUserTable.rules =  {
  	//{ label: "", prop: "id",  operate: false },
	  userName: [
	    { required: true, message: '姓名', trigger: 'blur' },
	  ],
	  account: [
	    { required: true, message: '账号', trigger: 'blur' },
	  ],
	  password: [
	    { required: true, message: '密码', trigger: 'blur' },
	  ],
	  email: [
	    { required: true, message: '邮箱', trigger: 'blur' },
	  ],
	  telephone: [
	    { required: true, message: '手机号', trigger: 'blur' },
	  ],
	  address: [
	    { required: true, message: '地址', trigger: 'blur' },
	  ],
	  cartType: [
	    { required: true, message: '证件类型', trigger: 'blur' },
	  ],
	  cartNo: [
	    { required: true, message: '证件号码', trigger: 'blur' },
	  ],
	  nationality: [
	    { required: true, message: '国籍', trigger: 'blur' },
	  ],
	  birth: [
	    { required: true, message: '生日', trigger: 'blur' },
	  ],
	  sex: [
	    { required: true, message: '性别', trigger: 'blur' },
	  ],
	  status: [
	    { required: true, message: '状态', trigger: 'blur' },
	  ],
	  errorCount: [
	    { required: true, message: '登录错误次数', trigger: 'blur' },
	  ],
	  loginIp: [
	    { required: true, message: '登录IP', trigger: 'blur' },
	  ],
	  loginMac: [
	    { required: true, message: '登录mac地址', trigger: 'blur' },
	  ],
	  createTime: [
	    { required: true, message: '创建时间', trigger: 'blur' },
	  ],
	  createId: [
	    { required: true, message: '创建人id', trigger: 'blur' },
	  ],
	  createName: [
	    { required: true, message: '创建人姓名', trigger: 'blur' },
	  ],
	  updateTime: [
	    { required: true, message: '修改时间', trigger: 'blur' },
	  ],
	  updateId: [
	    { required: true, message: '修改人id', trigger: 'blur' },
	  ],
	  updateName: [
	    { required: true, message: '修改人姓名', trigger: 'blur' },
	  ],
	  accountType: [
	    { required: true, message: '账号类型', trigger: 'blur' },
	  ],
	  remark: [
	    { required: true, message: '备注', trigger: 'blur' },
	  ],
	  reserve: [
	    { required: true, message: '扩展', trigger: 'blur' },
	  ],
	  reserve1: [
	    { required: true, message: '扩展1', trigger: 'blur' },
	  ],
	  reserve2: [
	    { required: true, message: '扩展2', trigger: 'blur' },
	  ],
	  reserve3: [
	    { required: true, message: '扩展3', trigger: 'blur' },
	  ],
	  reserve4: [
	    { required: true, message: '扩展4', trigger: 'blur' },
	  ],
	  reserve5: [
	    { required: true, message: '扩展5', trigger: 'blur' },
	  ],
}


export {
	SysUserTable
}
