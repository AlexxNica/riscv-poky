DESCRIPTION = "X protocol headers"
SECTION = "x11/libs"
LICENSE= "MIT-X"
PE = "1"

SRC_URI = "${XORG_MIRROR}/X11R7.0/src/proto/inputproto-${PV}.tar.bz2"
S = "${WORKDIR}/inputproto-${PV}"

inherit native autotools pkgconfig
