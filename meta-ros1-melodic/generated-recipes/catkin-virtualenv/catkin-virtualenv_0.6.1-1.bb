# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Bundle python requirements in a catkin package via virtualenv."
AUTHOR = "Paul Bovbel <pbovbel@locusrobotics.com>"
ROS_AUTHOR = "Paul Bovbel <pbovbel@locusrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d6fd5bd8a2ca0ce00c65331b4263470b"

ROS_CN = "catkin_virtualenv"
ROS_BPN = "catkin_virtualenv"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python3-venv} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_virtualenv} \
    python3 \
    python3-nose \
    python3-rospkg \
    rosbash \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/locusrobotics/catkin_virtualenv-release/archive/release/melodic/catkin_virtualenv/0.6.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/catkin_virtualenv"
SRC_URI = "git://github.com/locusrobotics/catkin_virtualenv-release;${ROS_BRANCH};protocol=https"
SRCREV = "5c01f91f8931aa8c4faea081d43f410439b2f2ef"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
