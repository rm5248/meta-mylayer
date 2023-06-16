SUMMARY = "Example Binary"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS:prepend = "${THISDIR}/files:"
SRC_URI = "file://example-binary.c file://CMakeLists.txt"
S = "${WORKDIR}"

DEPENDS = "libfoo"
RDEPENDS:${PN}-dev = "libfoo-staticdev"

inherit cmake

