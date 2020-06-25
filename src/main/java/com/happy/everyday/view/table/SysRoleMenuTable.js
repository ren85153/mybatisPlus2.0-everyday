
import {formDatetime} from '../../components/utils/formdata';

// SysRoleMenu表格column
var SysRoleMenuTable = {}

SysRoleMenuTable.column  = [
  	//{ label: "", prop: "id",  operate: false },

	  {
	  	prop: "roleId",
	  	operate: false,
	  },

	  {
	  	prop: "menuId",
	  	operate: false,
	  },

	  {
	  	prop: "status",
	  	operate: false,
	  },

	  {
	  	prop: "createTime",
	  	operate: false,
	  },

	  {
	  	prop: "updateName",
	  	operate: false,
	  },

]

SysRoleMenuTable.tableData  = []
SysRoleMenuTable.searchForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  roleId: '',
	  menuId: '',
	  status: '',
	  createTime: '',
	  updateName: '',
}
SysRoleMenuTable.createForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  roleId: '',
	  menuId: '',
	  status: '',
	  createTime: '',
	  updateName: '',
}

SysRoleMenuTable.rules =  {
  	//{ label: "", prop: "id",  operate: false },
	  roleId: [
	    { required: true, message: '', trigger: 'blur' },
	  ],
	  menuId: [
	    { required: true, message: '', trigger: 'blur' },
	  ],
	  status: [
	    { required: true, message: '', trigger: 'blur' },
	  ],
	  createTime: [
	    { required: true, message: '', trigger: 'blur' },
	  ],
	  updateName: [
	    { required: true, message: '', trigger: 'blur' },
	  ],
}


export {
	SysRoleMenuTable
}
