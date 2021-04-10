require conf/license/license-gplv2.inc


SRC_URI = " \
    file://ixuss-shutdown.sh "

INITSCRIPT_NAME = "ixuss-shutdown"
INITSCRIPT_PARAMS = "start 31 0 ."

inherit pkgconfig update-rc.d

do_install() {
    install -d ${D}${INIT_D_DIR}/
    install -m 0755 ${WORKDIR}/ixuss-shutdown.sh ${D}${INIT_D_DIR}/ixuss-shutdown
}

COMPATIBLE_MACHINE = "^(ixussone|ixusszero)$"
