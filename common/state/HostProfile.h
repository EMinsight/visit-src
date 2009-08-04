/*****************************************************************************
*
* Copyright (c) 2000 - 2009, Lawrence Livermore National Security, LLC
* Produced at the Lawrence Livermore National Laboratory
* LLNL-CODE-400124
* All rights reserved.
*
* This file is  part of VisIt. For  details, see https://visit.llnl.gov/.  The
* full copyright notice is contained in the file COPYRIGHT located at the root
* of the VisIt distribution or at http://www.llnl.gov/visit/copyright.html.
*
* Redistribution  and  use  in  source  and  binary  forms,  with  or  without
* modification, are permitted provided that the following conditions are met:
*
*  - Redistributions of  source code must  retain the above  copyright notice,
*    this list of conditions and the disclaimer below.
*  - Redistributions in binary form must reproduce the above copyright notice,
*    this  list of  conditions  and  the  disclaimer (as noted below)  in  the
*    documentation and/or other materials provided with the distribution.
*  - Neither the name of  the LLNS/LLNL nor the names of  its contributors may
*    be used to endorse or promote products derived from this software without
*    specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT  HOLDERS AND CONTRIBUTORS "AS IS"
* AND ANY EXPRESS OR  IMPLIED WARRANTIES, INCLUDING,  BUT NOT  LIMITED TO, THE
* IMPLIED WARRANTIES OF MERCHANTABILITY AND  FITNESS FOR A PARTICULAR  PURPOSE
* ARE  DISCLAIMED. IN  NO EVENT  SHALL LAWRENCE  LIVERMORE NATIONAL  SECURITY,
* LLC, THE  U.S.  DEPARTMENT OF  ENERGY  OR  CONTRIBUTORS BE  LIABLE  FOR  ANY
* DIRECT,  INDIRECT,   INCIDENTAL,   SPECIAL,   EXEMPLARY,  OR   CONSEQUENTIAL
* DAMAGES (INCLUDING, BUT NOT  LIMITED TO, PROCUREMENT OF  SUBSTITUTE GOODS OR
* SERVICES; LOSS OF  USE, DATA, OR PROFITS; OR  BUSINESS INTERRUPTION) HOWEVER
* CAUSED  AND  ON  ANY  THEORY  OF  LIABILITY,  WHETHER  IN  CONTRACT,  STRICT
* LIABILITY, OR TORT  (INCLUDING NEGLIGENCE OR OTHERWISE)  ARISING IN ANY  WAY
* OUT OF THE  USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
* DAMAGE.
*
*****************************************************************************/

#ifndef HOSTPROFILE_H
#define HOSTPROFILE_H
#include <state_exports.h>
#include <string>
#include <AttributeSubject.h>

// ****************************************************************************
// Class: HostProfile
//
// Purpose:
//    This class contains information needed to launch a remote,VisIt engine.
//
// Notes:      Autogenerated by xml2atts.
//
// Programmer: xml2atts
// Creation:   omitted
//
// Modifications:
//   
// ****************************************************************************

class STATE_API HostProfile : public AttributeSubject
{
public:
    enum ClientHostDetermination
    {
        MachineName,
        ManuallySpecified,
        ParsedFromSSHCLIENT
    };

    HostProfile();
    HostProfile(const HostProfile &obj);
    virtual ~HostProfile();

    virtual HostProfile& operator = (const HostProfile &obj);
    virtual bool operator == (const HostProfile &obj) const;
    virtual bool operator != (const HostProfile &obj) const;

    virtual const std::string TypeName() const;
    virtual bool CopyAttributes(const AttributeGroup *);
    virtual AttributeSubject *CreateCompatible(const std::string &) const;
    virtual AttributeSubject *NewInstance(bool) const;

    // Property selection methods
    virtual void SelectAll();
    void SelectProfileName();
    void SelectHost();
    void SelectUserName();
    void SelectPartition();
    void SelectBank();
    void SelectTimeLimit();
    void SelectLaunchMethod();
    void SelectArguments();
    void SelectLaunchArgs();
    void SelectSublaunchArgs();
    void SelectSublaunchPreCmd();
    void SelectSublaunchPostCmd();
    void SelectHostAliases();
    void SelectHostNickname();
    void SelectManualClientHostName();
    void SelectMachinefile();
    void SelectHwAccelPreCommand();
    void SelectHwAccelPostCommand();

    // Property setting methods
    void SetProfileName(const std::string &profileName_);
    void SetHost(const std::string &host_);
    void SetUserName(const std::string &userName_);
    void SetTimeout(int timeout_);
    void SetNumProcessors(int numProcessors_);
    void SetNumNodesSet(bool numNodesSet_);
    void SetNumNodes(int numNodes_);
    void SetPartitionSet(bool partitionSet_);
    void SetPartition(const std::string &partition_);
    void SetBankSet(bool bankSet_);
    void SetBank(const std::string &bank_);
    void SetTimeLimitSet(bool timeLimitSet_);
    void SetTimeLimit(const std::string &timeLimit_);
    void SetLaunchMethodSet(bool launchMethodSet_);
    void SetLaunchMethod(const std::string &launchMethod_);
    void SetForceStatic(bool forceStatic_);
    void SetForceDynamic(bool forceDynamic_);
    void SetActive(bool active_);
    void SetArguments(const stringVector &arguments_);
    void SetParallel(bool parallel_);
    void SetLaunchArgsSet(bool launchArgsSet_);
    void SetLaunchArgs(const std::string &launchArgs_);
    void SetSublaunchArgsSet(bool sublaunchArgsSet_);
    void SetSublaunchArgs(const std::string &sublaunchArgs_);
    void SetSublaunchPreCmdSet(bool sublaunchPreCmdSet_);
    void SetSublaunchPreCmd(const std::string &sublaunchPreCmd_);
    void SetSublaunchPostCmdSet(bool sublaunchPostCmdSet_);
    void SetSublaunchPostCmd(const std::string &sublaunchPostCmd_);
    void SetHostAliases(const std::string &hostAliases_);
    void SetHostNickname(const std::string &hostNickname_);
    void SetShareOneBatchJob(bool shareOneBatchJob_);
    void SetSshPortSpecified(bool sshPortSpecified_);
    void SetSshPort(int sshPort_);
    void SetClientHostDetermination(ClientHostDetermination clientHostDetermination_);
    void SetManualClientHostName(const std::string &manualClientHostName_);
    void SetMachinefileSet(bool machinefileSet_);
    void SetMachinefile(const std::string &machinefile_);
    void SetVisitSetsUpEnv(bool visitSetsUpEnv_);
    void SetCanDoHWAccel(bool canDoHWAccel_);
    void SetHavePreCommand(bool havePreCommand_);
    void SetHwAccelPreCommand(const std::string &hwAccelPreCommand_);
    void SetHavePostCommand(bool havePostCommand_);
    void SetHwAccelPostCommand(const std::string &hwAccelPostCommand_);
    void SetTunnelSSH(bool tunnelSSH_);

    // Property getting methods
    const std::string  &GetProfileName() const;
          std::string  &GetProfileName();
    const std::string  &GetHost() const;
          std::string  &GetHost();
    const std::string  &GetUserName() const;
          std::string  &GetUserName();
    int                GetTimeout() const;
    int                GetNumProcessors() const;
    bool               GetNumNodesSet() const;
    int                GetNumNodes() const;
    bool               GetPartitionSet() const;
    const std::string  &GetPartition() const;
          std::string  &GetPartition();
    bool               GetBankSet() const;
    const std::string  &GetBank() const;
          std::string  &GetBank();
    bool               GetTimeLimitSet() const;
    const std::string  &GetTimeLimit() const;
          std::string  &GetTimeLimit();
    bool               GetLaunchMethodSet() const;
    const std::string  &GetLaunchMethod() const;
          std::string  &GetLaunchMethod();
    bool               GetForceStatic() const;
    bool               GetForceDynamic() const;
    bool               GetActive() const;
    const stringVector &GetArguments() const;
          stringVector &GetArguments();
    bool               GetParallel() const;
    bool               GetLaunchArgsSet() const;
    const std::string  &GetLaunchArgs() const;
          std::string  &GetLaunchArgs();
    bool               GetSublaunchArgsSet() const;
    const std::string  &GetSublaunchArgs() const;
          std::string  &GetSublaunchArgs();
    bool               GetSublaunchPreCmdSet() const;
    const std::string  &GetSublaunchPreCmd() const;
          std::string  &GetSublaunchPreCmd();
    bool               GetSublaunchPostCmdSet() const;
    const std::string  &GetSublaunchPostCmd() const;
          std::string  &GetSublaunchPostCmd();
    const std::string  &GetHostAliases() const;
          std::string  &GetHostAliases();
    const std::string  &GetHostNickname() const;
          std::string  &GetHostNickname();
    bool               GetShareOneBatchJob() const;
    bool               GetSshPortSpecified() const;
    int                GetSshPort() const;
    ClientHostDetermination GetClientHostDetermination() const;
    const std::string  &GetManualClientHostName() const;
          std::string  &GetManualClientHostName();
    bool               GetMachinefileSet() const;
    const std::string  &GetMachinefile() const;
          std::string  &GetMachinefile();
    bool               GetVisitSetsUpEnv() const;
    bool               GetCanDoHWAccel() const;
    bool               GetHavePreCommand() const;
    const std::string  &GetHwAccelPreCommand() const;
          std::string  &GetHwAccelPreCommand();
    bool               GetHavePostCommand() const;
    const std::string  &GetHwAccelPostCommand() const;
          std::string  &GetHwAccelPostCommand();
    bool               GetTunnelSSH() const;

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool completeSave, bool forceAdd);
    virtual void SetFromNode(DataNode *node);

    // Enum conversion functions
    static std::string ClientHostDetermination_ToString(ClientHostDetermination);
    static bool ClientHostDetermination_FromString(const std::string &, ClientHostDetermination &);
protected:
    static std::string ClientHostDetermination_ToString(int);
public:

    // Keyframing methods
    virtual std::string               GetFieldName(int index) const;
    virtual AttributeGroup::FieldType GetFieldType(int index) const;
    virtual std::string               GetFieldTypeName(int index) const;
    virtual bool                      FieldsEqual(int index, const AttributeGroup *rhs) const;

    // User-defined methods
    static std::string defaultUserName;
    static std::vector<std::string> SplitHostPattern(const std::string &host);
    bool ProfileMatchesHost(const std::string&) const;
    std::string GetShortHostname() const;
    static std::string GetShortHostname(const std::string &host);
    static const std::string &GetDefaultUserName();
    static void SetDefaultUserName(const std::string &n);

    // IDs that can be used to identify fields in case statements
    enum {
        ID_profileName = 0,
        ID_host,
        ID_userName,
        ID_timeout,
        ID_numProcessors,
        ID_numNodesSet,
        ID_numNodes,
        ID_partitionSet,
        ID_partition,
        ID_bankSet,
        ID_bank,
        ID_timeLimitSet,
        ID_timeLimit,
        ID_launchMethodSet,
        ID_launchMethod,
        ID_forceStatic,
        ID_forceDynamic,
        ID_active,
        ID_arguments,
        ID_parallel,
        ID_launchArgsSet,
        ID_launchArgs,
        ID_sublaunchArgsSet,
        ID_sublaunchArgs,
        ID_sublaunchPreCmdSet,
        ID_sublaunchPreCmd,
        ID_sublaunchPostCmdSet,
        ID_sublaunchPostCmd,
        ID_hostAliases,
        ID_hostNickname,
        ID_shareOneBatchJob,
        ID_sshPortSpecified,
        ID_sshPort,
        ID_clientHostDetermination,
        ID_manualClientHostName,
        ID_machinefileSet,
        ID_machinefile,
        ID_visitSetsUpEnv,
        ID_canDoHWAccel,
        ID_havePreCommand,
        ID_hwAccelPreCommand,
        ID_havePostCommand,
        ID_hwAccelPostCommand,
        ID_tunnelSSH
    };

private:
    std::string  profileName;
    std::string  host;
    std::string  userName;
    int          timeout;
    int          numProcessors;
    bool         numNodesSet;
    int          numNodes;
    bool         partitionSet;
    std::string  partition;
    bool         bankSet;
    std::string  bank;
    bool         timeLimitSet;
    std::string  timeLimit;
    bool         launchMethodSet;
    std::string  launchMethod;
    bool         forceStatic;
    bool         forceDynamic;
    bool         active;
    stringVector arguments;
    bool         parallel;
    bool         launchArgsSet;
    std::string  launchArgs;
    bool         sublaunchArgsSet;
    std::string  sublaunchArgs;
    bool         sublaunchPreCmdSet;
    std::string  sublaunchPreCmd;
    bool         sublaunchPostCmdSet;
    std::string  sublaunchPostCmd;
    std::string  hostAliases;
    std::string  hostNickname;
    bool         shareOneBatchJob;
    bool         sshPortSpecified;
    int          sshPort;
    int          clientHostDetermination;
    std::string  manualClientHostName;
    bool         machinefileSet;
    std::string  machinefile;
    bool         visitSetsUpEnv;
    bool         canDoHWAccel;
    bool         havePreCommand;
    std::string  hwAccelPreCommand;
    bool         havePostCommand;
    std::string  hwAccelPostCommand;
    bool         tunnelSSH;

    // Static class format string for type map.
    static const char *TypeMapFormatString;
};

#endif
