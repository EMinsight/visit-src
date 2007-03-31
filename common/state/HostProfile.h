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
// Creation:   Thu Oct 9 13:40:01 PST 2003
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

    virtual void operator = (const HostProfile &obj);
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
    void SelectHostAliases();
    void SelectManualClientHostName();

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
    void SetHostAliases(const std::string &hostAliases_);
    void SetShareOneBatchJob(bool shareOneBatchJob_);
    void SetSshPortSpecified(bool sshPortSpecified_);
    void SetSshPort(int sshPort_);
    void SetClientHostDetermination(ClientHostDetermination clientHostDetermination_);
    void SetManualClientHostName(const std::string &manualClientHostName_);

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
    const std::string  &GetHostAliases() const;
          std::string  &GetHostAliases();
    bool               GetShareOneBatchJob() const;
    bool               GetSshPortSpecified() const;
    int                GetSshPort() const;
    ClientHostDetermination GetClientHostDetermination() const;
    const std::string  &GetManualClientHostName() const;
          std::string  &GetManualClientHostName();

    // Persistence methods
    virtual bool CreateNode(DataNode *node, bool forceAdd);
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
    std::string  hostAliases;
    bool         shareOneBatchJob;
    bool         sshPortSpecified;
    int          sshPort;
    int          clientHostDetermination;
    std::string  manualClientHostName;
};

#endif
