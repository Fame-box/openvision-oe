SRC_URI = "${@bb.utils.contains_any("MACHINE_FEATURES", "nogamma", "git://github.com/OpenVisionE2/servicemp3amlogic.git", "git://github.com/openpli/servicemp3.git;branch=master", d)}"

EXTRA_OECONF_append += "\
	${@bb.utils.contains("MACHINE_FEATURES", "nogamma", "--with-amlogic" , "", d)} \
	"
