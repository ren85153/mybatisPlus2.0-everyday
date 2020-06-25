
import {formDatetime} from '../../components/utils/formdata';

// SysUserRole表格column
var SysUserRoleTable = {}

SysUserRoleTable.column  = [
  	//{ label: "", prop: "id",  operate: false },

	  {
	  	prop: "userId",
	  	operate: false,
	  },

	  {
	  	prop: "roleId",
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

SysUserRoleTable.tableData  = []
SysUserRoleTable.searchForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  userId: '',
	  roleId: '',
	  status: '',
	  createTime: '',
	  updateName: '',
}
SysUserRoleTable.createForm   = {
  	//{ label: "", prop: "id",  operate: false },
	  userId: '',
	  roleId: '',
	  status: '',
	  createTime: '',
	  updateName: '',
}

SysUserRoleTable.rules =  {
  	//{ label: "", prop: "id",  operate: false },
	  userId: [
	    { required: true, message: '', trigger: 'blur' },
	  ],
	  roleId: [
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
	SysUserRoleTable
}
