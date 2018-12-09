FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += "\
	${@bb.utils.contains("MACHINE_FEATURES", "ixuss", "file://ixuss-disable-blending-issues.patch", "", d)} \
"
