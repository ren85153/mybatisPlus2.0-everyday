
import {formDatetime} from '../../components/utils/formdata';

// SysLogs表格column
var SysLogsTable = {}

SysLogsTable.column  = [
  	//{ label: "", prop: "id",  operate: false },

	  {
	  	label: "操作类型",
	  	prop: "operType",
	  	operate: false,
	  },

	  {
	  	label: "操作内容",
	  	prop: "operContent",
	  	operate: false,
	  },

	  {
	  	label: "操作时间",
	  	prop: "createTime",
	  	operate: false,
	  },

	  {
	  	label: "操作人",
	  	prop: "createId",
	  	operate: false,
	  },

	  {
	  	label: "IP地址",
	  	prop: "ip",
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

SysLogsTable.tableData  = []
SysLogsTable.searchForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  operType: '',
	  operContent: '',
	  createTime: '',
	  createId: '',
	  ip: '',
	  reserve: '',
	  reserve1: '',
	  reserve2: '',
	  reserve3: '',
	  reserve4: '',
	  reserve5: '',
}
SysLogsTable.createForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  operType: '',
	  operContent: '',
	  createTime: '',
	  createId: '',
	  ip: '',
	  reserve: '',
	  reserve1: '',
	  reserve2: '',
	  reserve3: '',
	  reserve4: '',
	  reserve5: '',
}

SysLogsTable.rules =  {
  	//{ label: "", prop: "id",  operate: false },
	  operType: [
	    { required: true, message: '操作类型', trigger: 'blur' },
	  ],
	  operContent: [
	    { required: true, message: '操作内容', trigger: 'blur' },
	  ],
	  createTime: [
	    { required: true, message: '操作时间', trigger: 'blur' },
	  ],
	  createId: [
	    { required: true, message: '操作人', trigger: 'blur' },
	  ],
	  ip: [
	    { required: true, message: 'IP地址', trigger: 'blur' },
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
	SysLogsTable
}
