
import {formDatetime} from '../../components/utils/formdata';

// SysMenu表格column
var SysMenuTable = {}

SysMenuTable.column  = [
  	//{ label: "", prop: "id",  operate: false },

	  {
	  	label: "菜单名称",
	  	prop: "menuName",
	  	operate: false,
	  },

	  {
	  	label: "菜单类型",
	  	prop: "menuType",
	  	operate: false,
	  },

	  {
	  	label: "菜单等级",
	  	prop: "menuLevel",
	  	operate: false,
	  },

	  {
	  	label: "菜单路径",
	  	prop: "menuUrl",
	  	operate: false,
	  },

	  {
	  	label: "父级id",
	  	prop: "parentId",
	  	operate: false,
	  },

	  {
	  	label: "菜单图标",
	  	prop: "menuIcon",
	  	operate: false,
	  },

	  {
	  	label: "菜单顺序",
	  	prop: "menuOrder",
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

SysMenuTable.tableData  = []
SysMenuTable.searchForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  menuName: '',
	  menuType: '',
	  menuLevel: '',
	  menuUrl: '',
	  parentId: '',
	  menuIcon: '',
	  menuOrder: '',
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
SysMenuTable.createForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  menuName: '',
	  menuType: '',
	  menuLevel: '',
	  menuUrl: '',
	  parentId: '',
	  menuIcon: '',
	  menuOrder: '',
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

SysMenuTable.rules =  {
  	//{ label: "", prop: "id",  operate: false },
	  menuName: [
	    { required: true, message: '菜单名称', trigger: 'blur' },
	  ],
	  menuType: [
	    { required: true, message: '菜单类型', trigger: 'blur' },
	  ],
	  menuLevel: [
	    { required: true, message: '菜单等级', trigger: 'blur' },
	  ],
	  menuUrl: [
	    { required: true, message: '菜单路径', trigger: 'blur' },
	  ],
	  parentId: [
	    { required: true, message: '父级id', trigger: 'blur' },
	  ],
	  menuIcon: [
	    { required: true, message: '菜单图标', trigger: 'blur' },
	  ],
	  menuOrder: [
	    { required: true, message: '菜单顺序', trigger: 'blur' },
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
	SysMenuTable
}
