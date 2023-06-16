SUMMARY = "Libfoo"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS:prepend = "${THISDIR}/files:"
SRC_URI = "file://foo.h file://foo.c file://CMakeLists.txt"
S = "${WORKDIR}"

inherit cmake
