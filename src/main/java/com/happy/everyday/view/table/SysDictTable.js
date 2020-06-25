
import {formDatetime} from '../../components/utils/formdata';

// SysDict表格column
var SysDictTable = {}

SysDictTable.column  = [
  	//{ label: "", prop: "id",  operate: false },

	  {
	  	label: "字典名称",
	  	prop: "dictName",
	  	operate: false,
	  },

	  {
	  	label: "字典编码",
	  	prop: "dictCode",
	  	operate: false,
	  },

	  {
	  	label: "字典类型",
	  	prop: "dictType",
	  	operate: false,
	  },

	  {
	  	label: "组名",
	  	prop: "groupName",
	  	operate: false,
	  },

	  {
	  	label: "组编码",
	  	prop: "groupCode",
	  	operate: false,
	  },

	  {
	  	label: "父级id",
	  	prop: "parentId",
	  	operate: false,
	  },

	  {
	  	label: "状态",
	  	prop: "status",
	  	operate: false,
	  },

	  {
	  	label: "排序",
	  	prop: "dictOrder",
	  	operate: false,
	  },

	  {
	  	label: "备注",
	  	prop: "remark",
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

SysDictTable.tableData  = []
SysDictTable.searchForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  dictName: '',
	  dictCode: '',
	  dictType: '',
	  groupName: '',
	  groupCode: '',
	  parentId: '',
	  status: '',
	  dictOrder: '',
	  remark: '',
	  createTime: '',
	  createId: '',
	  createName: '',
	  updateTime: '',
	  updateId: '',
	  updateName: '',
	  reserve: '',
	  reserve1: '',
	  reserve2: '',
	  reserve3: '',
	  reserve4: '',
	  reserve5: '',
}
SysDictTable.createForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  dictName: '',
	  dictCode: '',
	  dictType: '',
	  groupName: '',
	  groupCode: '',
	  parentId: '',
	  status: '',
	  dictOrder: '',
	  remark: '',
	  createTime: '',
	  createId: '',
	  createName: '',
	  updateTime: '',
	  updateId: '',
	  updateName: '',
	  reserve: '',
	  reserve1: '',
	  reserve2: '',
	  reserve3: '',
	  reserve4: '',
	  reserve5: '',
}

SysDictTable.rules =  {
  	//{ label: "", prop: "id",  operate: false },
	  dictName: [
	    { required: true, message: '字典名称', trigger: 'blur' },
	  ],
	  dictCode: [
	    { required: true, message: '字典编码', trigger: 'blur' },
	  ],
	  dictType: [
	    { required: true, message: '字典类型', trigger: 'blur' },
	  ],
	  groupName: [
	    { required: true, message: '组名', trigger: 'blur' },
	  ],
	  groupCode: [
	    { required: true, message: '组编码', trigger: 'blur' },
	  ],
	  parentId: [
	    { required: true, message: '父级id', trigger: 'blur' },
	  ],
	  status: [
	    { required: true, message: '状态', trigger: 'blur' },
	  ],
	  dictOrder: [
	    { required: true, message: '排序', trigger: 'blur' },
	  ],
	  remark: [
	    { required: true, message: '备注', trigger: 'blur' },
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
	SysDictTable
}
