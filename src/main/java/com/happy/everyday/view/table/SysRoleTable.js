
import {formDatetime} from '../../components/utils/formdata';

// SysRole表格column
var SysRoleTable = {}

SysRoleTable.column  = [
  	//{ label: "", prop: "id",  operate: false },

	  {
	  	label: "角色名称",
	  	prop: "roleName",
	  	operate: false,
	  },

	  {
	  	label: "角色类型",
	  	prop: "roleType",
	  	operate: false,
	  },

	  {
	  	label: "角色编码",
	  	prop: "roleCode",
	  	operate: false,
	  },

	  {
	  	label: "状态",
	  	prop: "status",
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

SysRoleTable.tableData  = []
SysRoleTable.searchForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  roleName: '',
	  roleType: '',
	  roleCode: '',
	  status: '',
	  createTime: '',
	  createId: '',
	  createName: '',
	  updateTime: '',
	  updateId: '',
	  updateName: '',
	  remark: '',
	  reserve: '',
	  reserve1: '',
	  reserve2: '',
	  reserve3: '',
	  reserve4: '',
	  reserve5: '',
}
SysRoleTable.createForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  roleName: '',
	  roleType: '',
	  roleCode: '',
	  status: '',
	  createTime: '',
	  createId: '',
	  createName: '',
	  updateTime: '',
	  updateId: '',
	  updateName: '',
	  remark: '',
	  reserve: '',
	  reserve1: '',
	  reserve2: '',
	  reserve3: '',
	  reserve4: '',
	  reserve5: '',
}

SysRoleTable.rules =  {
  	//{ label: "", prop: "id",  operate: false },
	  roleName: [
	    { required: true, message: '角色名称', trigger: 'blur' },
	  ],
	  roleType: [
	    { required: true, message: '角色类型', trigger: 'blur' },
	  ],
	  roleCode: [
	    { required: true, message: '角色编码', trigger: 'blur' },
	  ],
	  status: [
	    { required: true, message: '状态', trigger: 'blur' },
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
	SysRoleTable
}
