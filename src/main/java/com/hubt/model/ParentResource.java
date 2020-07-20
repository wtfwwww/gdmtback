package com.hubt.model;

import java.util.List;

import com.hubt.vo.ResourceVo;

public class ParentResource {
	 private String menuId;

	    private String dirCode;

	    private String dirName;

	    private Integer dirLevelNumber;

	    private String dirType;

	    private String resourceId;

	    private String parentId;

	    private String isitem;

	    private Integer dirOrder;

	    private String status;

	    private String flag;

	    private String menuGroupId;

	    private String locale;

	    private String resUuid;

	    private String realid;

	    private String istransfer;

	    private String menuType;
	    
	    private ResourceVo parent;
	    
	    /*

	    public resource(String dirCode, String dirName, Integer dirLevelNumber, String isitem, Integer dirOrder,
				String locale, String resUuid) {
			super();
			this.dirCode = dirCode;
			this.dirName = dirName;
			this.dirLevelNumber = dirLevelNumber;
			this.isitem = isitem;
			this.dirOrder = dirOrder;
			this.locale = locale;
			this.resUuid = resUuid;
		}

		public resource() {
			super();
			// TODO Auto-generated constructor stub
		}
		*/

		public ResourceVo getParent() {
			return parent;
		}

		public void setParent(ResourceVo parent) {
			this.parent = parent;
		}

		public String getMenuId() {
	        return menuId;
	    }

	    public void setMenuId(String menuId) {
	        this.menuId = menuId == null ? null : menuId.trim();
	    }

	    public String getDirCode() {
	        return dirCode;
	    }

	    public void setDirCode(String dirCode) {
	        this.dirCode = dirCode == null ? null : dirCode.trim();
	    }

	    public String getDirName() {
	        return dirName;
	    }

	    public void setDirName(String dirName) {
	        this.dirName = dirName == null ? null : dirName.trim();
	    }

	    public Integer getDirLevelNumber() {
	        return dirLevelNumber;
	    }

	    public void setDirLevelNumber(Integer dirLevelNumber) {
	        this.dirLevelNumber = dirLevelNumber;
	    }

	    public String getDirType() {
	        return dirType;
	    }

	    public void setDirType(String dirType) {
	        this.dirType = dirType == null ? null : dirType.trim();
	    }

	    public String getResourceId() {
	        return resourceId;
	    }

	    public void setResourceId(String resourceId) {
	        this.resourceId = resourceId == null ? null : resourceId.trim();
	    }

	    public String getParentId() {
	        return parentId;
	    }

	    public void setParentId(String parentId) {
	        this.parentId = parentId == null ? null : parentId.trim();
	    }

	    public String getIsitem() {
	        return isitem;
	    }

	    public void setIsitem(String isitem) {
	        this.isitem = isitem == null ? null : isitem.trim();
	    }

	    public Integer getDirOrder() {
	        return dirOrder;
	    }

	    public void setDirOrder(Integer dirOrder) {
	        this.dirOrder = dirOrder;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status == null ? null : status.trim();
	    }

	    public String getFlag() {
	        return flag;
	    }

	    public void setFlag(String flag) {
	        this.flag = flag == null ? null : flag.trim();
	    }

	    public String getMenuGroupId() {
	        return menuGroupId;
	    }

	    public void setMenuGroupId(String menuGroupId) {
	        this.menuGroupId = menuGroupId == null ? null : menuGroupId.trim();
	    }

	    public String getLocale() {
	        return locale;
	    }

	    public void setLocale(String locale) {
	        this.locale = locale == null ? null : locale.trim();
	    }

	    public String getResUuid() {
	        return resUuid;
	    }

	    public void setResUuid(String resUuid) {
	        this.resUuid = resUuid == null ? null : resUuid.trim();
	    }

	    public String getRealid() {
	        return realid;
	    }

	    public void setRealid(String realid) {
	        this.realid = realid == null ? null : realid.trim();
	    }

	    public String getIstransfer() {
	        return istransfer;
	    }

	    public void setIstransfer(String istransfer) {
	        this.istransfer = istransfer == null ? null : istransfer.trim();
	    }

	    public String getMenuType() {
	        return menuType;
	    }

	    public void setMenuType(String menuType) {
	        this.menuType = menuType == null ? null : menuType.trim();
	    }

	private List<ParentResource> children;

	public List<ParentResource> getChildren() {
		return children;
	}

	public void setChildren(List<ParentResource> children) {
		this.children = children;
	}
}
