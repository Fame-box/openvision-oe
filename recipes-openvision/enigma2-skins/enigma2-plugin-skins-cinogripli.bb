DESCRIPTION = "GriPLi FHD skin by Cino for Open Vision and OpenPLI based images."
MAINTAINER = "dreamosat-forum.com"
SECTION = "misc"
PRIORITY = "optional"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://LICENSE;md5=858b014508205322d36421a11207867c"

inherit gitpkgv allarch

PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

RRECOMMENDS_${PN} = "enigma2-plugin-extensions-weatherplugin2"

SRC_URI = "git://github.com/audi06/CinoGriPLi.git;protocol=git"

FILES_${PN} = "${datadir}/enigma2/ ${libdir}/enigma2/"

S = "${WORKDIR}/git"

do_compile() {
}

do_install() {
	install -d ${D}${datadir}
	cp -r --preserve=mode,links ${S}${datadir}/* ${D}${datadir}/
	chmod -R a+rX ${D}${datadir}/enigma2/

        install -d ${D}${libdir}
        cp -r --preserve=mode,links ${S}${libdir}/* ${D}${libdir}/
        chmod -R a+rX ${D}${libdir}/enigma2/
}

